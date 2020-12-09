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
    <title>挂号</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../Css/style.css" />
    <script type="text/javascript" src="../Js/jquery.js"></script>
    <script type="text/javascript" src="../Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../Js/bootstrap.js"></script>
    <script type="text/javascript" src="../Js/ckform.js"></script>
    <script type="text/javascript" src="../Js/common.js"></script>
    <script type="text/javascript" src="../Js/ckeditor/ckeditor.js"></script>
    <script type="text/javascript" src="../Js/jquery-3.4.1.js"></script>
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
    		var date = new Date();
    		$("#rid").val(date.getTime());
    		
    		$("#rid").prop("readonly",true);
    		
    		$.ajax({
				url:"${path}detailsDepartmentDoc.doc",
				data:{"department":$("#department").val()},
				dataType:"json",
				type:"post",
				success:function(obt){
					//将医生的姓名显示在下拉选
					//console.log(typeof obt);
					//var obt1 = JSON.parse(obt);
					//console.log(typeof jjj)
					
					//将获取到的json对象遍历
					$(obt).each(function(i,dom){
    					//在页面加载的时候，添加下拉列表
						$("#doctor").append("<option value='"+dom["did"]+"'>"+dom["name"]+"</option>");
    				});
					 /* $.each(obt,function(i,dom){
						alert(i);
						alert(dom);
	    				$("#doctor").append("<option value='"+dom["did"]+"'>"+dom["name"]+"</option>");
	    			});  */
				}
			});
    		
    		//
    		$("#backid").click(function(){
    			history.back();
    		});
    		$("#department").change(function(){
    			$.ajax({
    				url:"${path}detailsDepartmentDoc.doc",
    				data:{"department":$("#department").val()},
    				dataType:"json",
    				type:"post",
    				success:function(obt){
    					//alert(obt);
    					//将医生的姓名显示在下拉选
    				/* 	$(obt).each(function(i,dom){
    						alert(i);
    						alert(dom);
    						$("#doctor").append("<option value='"+dom["did"]+"'>"+dom["name"]+"</option>");
    					}); */
    					
    					//每次加载后的下拉列表进行清除操作
    					$("#doctor").empty();
            			//将医生的姓名显示在下拉选
            			//var obt1 = JSON.parse(obt);
            			$.each(obt,function(i,dom){
            				
            				$("#doctor").append("<option value='"+dom["did"]+"'>"+dom["name"]+"</option>");
            			});
    				}
    			});
    			
    		});
    	});
    </script>
</head>
<body>
<form action="${path}addRegister.reg" method="post" class="definewidth m20">
	<input name="method" value="insertRegister" type="hidden">
<table class="table table-bordered table-hover definewidth m10">
	<tr>
        <td width="10%" class="tableleft">病历号</td>
        <td><input type="text" name="rid" value="" id="rid"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td><input type="text" name="name" value=""/></td>
    </tr>

    <tr>
        <td width="10%" class="tableleft">身份证号</td>
        <td><input type="text" name="idCard" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">社保号</td>
        <td><input type="text" name="siNumber" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">挂号费</td>
        <td><input type="text" name="registerMoney" value=""/>元</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">联系电话</td>
        <td><input type="text" name="phone" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">是否自费</td>
        <td><input type="radio" name="isPay" value="0" checked/>否&nbsp;&nbsp;&nbsp;
            <input type="radio" name="isPay" value="1"/>是</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        <td><input type="radio" name="sex" value="0" checked/>男&nbsp;&nbsp;&nbsp;
            <input type="radio" name="sex" value="1"/>女</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td><input type="text" name="age" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">初复诊</td>
        <td><input type="radio" name="consultation" value="0" checked/>初诊&nbsp;&nbsp;&nbsp;
            <input type="radio" name="consultation" value="1"/>复诊</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">所挂科室</td>
        <td>
        	<select name="department" id="department">
        		<option value="1">急诊科</option>
        		<option value="2">儿科</option>
        		<option value="3">妇科</option>
        		<option value="4">皮肤科</option>
        		<option value="5">内分泌科</option>
        		<option value="6">牙科</option>
        	</select>
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">指定医生</td>
        <td>
        	<select name="did" id="doctor">

	        </select>
    </tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><textarea name="remark"></textarea></td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>