<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getScheme()+"://"+request.getServerName()+":"+
	request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
    <title>添加医生</title>
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
 	<script type="text/javascript" src="../Js/My97DatePicker/WdatePicker.js"></script>

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
    $(function () {       
		$('#backid').click(function(){
			history.back();
		});
    });
    </script>
</head>
<body>

<form action="queryDocByPage.doc" method="post" class="definewidth m20">
<input type="hidden" name="method" value="insertDoctor">

<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td><input type="text" name="name" value=""/></td>
    </tr>
    
    <tr>
        <td width="10%" class="tableleft">身份证号</td>
        <td><input type="text" name="cardno" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">手机</td>
        <td><input type="text" name="phone" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        <td><input type="radio" name="sex" value="0" checked/>男&nbsp;&nbsp;&nbsp;
        <input type="radio" name="sex"  value="1"/>女</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">出生年月</td>
        <td><input type="text" name="birthday" class="Wdate" onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td><input type="text" name="age" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">电子邮箱</td>
        <td><input type="text" name="email" value=""/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">所属科室</td>
        <td>
        	<select name="department">
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
        <td width="10%" class="tableleft">学历</td>
        <td>
        	<select name="education">
        		<option value="1">专科</option>
        		<option value="2">本科</option>
        		<option value="3">研究生</option>
        		<option value="4">博士</option>
        	</select>
        </td>
    </tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><textarea name="remark"></textarea></td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
			<input name="save" id="save" type="submit" class="btn btn-primary" value="保存"/>
			 &nbsp;&nbsp;
			 <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
</body>
</html>