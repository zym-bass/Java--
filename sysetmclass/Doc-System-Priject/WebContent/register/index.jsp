<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=this.getServletContext().getContextPath() %>/register/">
    <title>门诊查询</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
	 $(function(){
		 //跳转添加页面
		 $("#newNav").click(function(){
			 $(location).prop("href","${path}register/add.jsp");
		 });
			 
		//全选和全不选
		$("#checkall").on("click",function(){
			$(".c1").prop("checked",$(this).prop("checked"));
		});
		
		//删除医生信息
    	$("#delRegister").on("click",function(){
    		alert(1);
    		//声明jQuery对象数组 将复选框中的对象存入其中
    		$arr = $("#tb :checkbox:checked");//选中的复选框
    		if($arr.length>=1){
    			//2. 获取选中复选框对象的医生编号
    			var array = new Array();
    			$arr.each(function(i,dom){
    				//3. 将选中的复选框对应的医生编号放入到数组中
    				array[i]=$(dom).val();
    			});
    			//4， 将数组按照一定格式转变为字符串 v1,v2 , v3 ....
    			var dids = array.join(",");
    			//发送批量删除的请求-->同时将ids发送过去
    			location.href="${path}delRegister.reg?dids="+dids;
    		}else{
    			alert("请至少选中一个要删除的选项")	;
    		}
    	});
	 });
    </script>
</head>
<body>

<form action="${path}likesql.reg" method="post" class="definewidth m20">
<input name="method" value="findRegisterByPage" type="hidden"/>
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">病历号：</td>
        <td><input type="text" id="rid" name="rid" value=""/></td>
		
        <td width="10%" class="tableleft">姓名：</td>
        <td><input type="text" id="name" name="name" value=""/></td>
		
        <td width="10%" class="tableleft">科室：</td>
        <td>
        	<select name="department" id="department">
	        	<option value="0" >==请选择==</option>
	        	<option value="1" >急诊科</option>
	        	<option value="2" >儿科</option>
	        	<option value="3" >妇科</option>
	        	<option value="4" >皮肤科</option>
	        	<option value="5" >内分泌科</option>
	        	<option value="6" >牙科</option>
        	</select>
        </td>
    </tr>
    <tr>
		  <td colspan="6">
		  <center>
            <input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
			<input name="ret" id="ret" type="button" class="btn btn-primary" value="清空"/>
            </center>
        </td>
    </tr>
</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead>
    <tr>
    	<th><input type="checkbox" id="checkall" "></th>
        <th>病例号</th>
        <th>病人姓名</th>
        <th>主治医生</th>
        <th>挂号时间</th>
        <th>挂号科室</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody id="tb">
 	 <c:forEach items="${list}" var="s">
    	<tr>
    	<td><input type="checkbox" class="c1" value="${s.rid }"  ></td>
        <td>${s.rid}</td>
        <td>${s.name}</td>
        <td>${s.doctor.name}</td>
        <td>${s.registerDate}</td>
        <td>
        <c:if test="${s.department==1}">急诊科</c:if>
        <c:if test="${s.department==2}">儿科</c:if>
        <c:if test="${s.department==3}">妇科</c:if>
        <c:if test="${s.department==4}">皮肤科</c:if>
        <c:if test="${s.department==5}">内分泌科</c:if>
        <c:if test="${s.department==6}">牙科</c:if>
        
        </td>
        <td><a href="${path}detailsReg.reg?rid=${s.rid}">详情</a>&nbsp;&nbsp;&nbsp;<a href='${path}midifyReg.reg?rid=${s.rid}'>修改</a></th>
    </tr>
    </c:forEach>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  
  		<div class="inline pull-right page">
	          <a href="${path}queryRegister.reg?courrentPage=1" >首页</a> 
	          <a href="${path}queryRegister.reg?courrentPage=${page.lastPage}">上一页</a>     
	          <a href="${path}queryRegister.reg?courrentPage=${page.nextPage}" >下一页</a> 
	          <a href="${path}queryRegister.reg?courrentPage=${page.countPage}" >尾页</a>
			  &nbsp;&nbsp;&nbsp;
			     共<span class='current'>${page.rows} </span>条记录
			     <span class='current'>${page.courrentPage}/${page.countPage}</span>页
		</div>
		<div>
		   <button type="button" class="btn btn-success" id="newNav">门诊挂号</button>&nbsp;&nbsp;&nbsp;
		   <button type="button" class="btn btn-success" id="delRegister">批量删除</button>
		</div>
	</th></tr>
  </table>
</body>
</html>
