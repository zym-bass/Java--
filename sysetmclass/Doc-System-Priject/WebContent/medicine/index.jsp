<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
	String imgPath=request.getScheme()+"://"+request.getServerName()+":"+
			request.getServerPort()+"/Hospital-pic/";
%>
<!DOCTYPE html>
<html>
<base href="<%=this.getServletContext().getContextPath() %>/medicine/">
<head>
    <title>药品查询</title>
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
		.imgDiv{
			text-align:center;
			width:100%;
			height:70px;
			
		}
		.imgPlus{
			height:100%;
		}
    </style>
    <script type="text/javascript">
		$(function(){
			
			$("#newNav").click(function(){
				$(location).attr("href","../medicine/add.jsp");
				
			});
			//删除医生信息
        	$("#delAll").click(function(){
        		
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
        			var mids = array.join(",");
        			//发送批量删除的请求-->同时将ids发送过去
        			location.href="${path}delMedicine.med?mids="+mids; 
        		}else{
        			alert("请至少选中一个要删除的选项");	
        		};
        	});
		})
		
		//全选和不全选
    	function checkall(obj){
    		$(".c1").prop("checked",$(obj).prop("checked"));
    	}
    </script>
</head>
<body>

<form action="${path }likeMed.med" method="post" class="definewidth m20">
	<table class="table table-bordered table-hover definewidth m10">
	    <tr>
	        <td width="10%" class="tableleft">药品名称：</td>
	        <td><input type="text" id="name" name="name" value=""/></td>
			
	        <td width="10%" class="tableleft">药品类型：</td>
	        <td>
		        <select name="type" id="type">
		        	<option value="0" >==请选择==</option>
		       		<option value="1" >处方药</option>
			        <option value="2" >中药</option>
			        <option value="3" >西药</option>
		        </select>
	        </td>
	    </tr>
	    <tr>
			  <td colspan="4">
				<center>
					<input id="find" name="find" type="submit" class="btn btn-primary" value="查询"/>
			  		<input id="ret" name="ret" type="button" class="btn btn-primary" value="清空"/> 
				</center>
	        </td>
	    </tr>
	</table>
</form>
   
<table class="table table-bordered table-hover definewidth m10" >
   <thead  >
    <tr>
    	<th><input type="checkbox" id="checkall" onChange="checkall(this)"></th>
        <th>药品编号</th>
        <th>药品名称</th>
        <th>图片</th>
        <th>药品类型</th>
        <th>简单描述</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody id="tb" >
    	<c:forEach items="${list}"  var="s">
    	<tr>
    	<td><input type="checkbox" class="c1" value="'${s.mid}'" ></th>
        <td>${s.mid}</th>
        <td>${s.name}</th>
        <td> <div class="imgDiv"><img   src="/prc/${s.picture}" class="imgPlus" ></div></td>
        <td>
        	<c:if test="${s.type==1}">处方药</c:if>
        	<c:if test="${s.type==2}">中药</c:if>
        	<c:if test="${s.type==3}">西药</c:if>
        </td>
        <td>${s.descs}</th>
        <td><a href="${path}detailsMed.med?mid=${s.mid}">详情</a> <a href="${path}OnlyqueryMed.med?mid=${s.mid}">修改</a></th>
    </tr>		
    	
    	</c:forEach>
     </tbody>
  </table>
  
  <table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  
  			<div class="inline pull-right page">
	          <a href="../queryMedByPage.med?courrent=1" >首页</a> 
	          <a href="../queryMedByPage.med?courrent=${page.lastPage}">上一页</a>     
	          <a href="../queryMedByPage.med?courrent=${page.nextPage}" >下一页</a> 
	          <a href="../queryMedByPage.med?courrent=${page.countPage}" >尾页</a>
			  &nbsp;&nbsp;&nbsp;
			     共<span class='current'>${page.rows}</span>条记录
			  <span class='current'>${page.courrentPage}/${page.countPage}  </span>页
		  </div>
		 <div>
			<button type="button" class="btn btn-success" id="newNav">添加新药</button>	
			<button type="button" class="btn btn-success" id="delAll">批量删除</button>		
		 </div>
		 
		 </th></tr>
  </table>
  
</body>
</html>
