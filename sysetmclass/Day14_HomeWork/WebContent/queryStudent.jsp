<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,entity.Student"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<script src="jquery.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	$(function() {
		//点击按钮获取选中复选框的值
		var a = true;
		$("#btn1").click(function() {
			$arr = $("input:checkbox");
			/* console.log($arr.length); */
			$arr.each(function(i, dom) {
				$(dom).prop("checked", a);
			})
			if (a == true) {
				a = false
			} else {
				a = true;
			}
			console.log(a);
		});
		$("#btn").click(function() {
			location.href = "queryStudent2.st?curPage=" + $("#pagenum").val();
		});

	});
</script>


<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td, th {
	width: 188px;
	text-align: center;
	height: 100px;
}
</style>

<script type="text/javascript">
	
</script>

</head>

<body>
<center>
		<c:if test="${!empty userinfo}">
  	欢迎进入到首页${pageScope.name}!!	 <a href="logout.st">安全退出</a>
		</c:if>
		<c:if test="${empty userinfo}">
			<jsp:forward page="index.jsp"></jsp:forward>
			<%-- <c:redirect url="login.jsp"></c:redirect> --%>
		</c:if>
	</center>
	<>
	<center>
		<form action="likequery.st">
			姓名：<input type="text" name="sname">
			&nbsp;&nbsp;&nbsp;
			性别:<select name="gender">
					<option value="-1">请选择</option>
					<option value="0">男</option>
					<option value="1">女</option>
				</select>
				<input type="submit" value="查询"/>
		</form>
	</center>


	<form action="quanxuan.st">
		<table border="1px" width="60%" align="center" cellpadding="0"
			cellspacing="0">

			<tr>
				<th>全选或全不选<input type="button" id="btn1" value="点击" /></th>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>生日</th>
				<th>爱好</th>
				<th>头像</th>
				<th>删除&nbsp;&nbsp;&nbsp;修改</th>
			</tr>

			<c:forEach items="${list}" var="s">
				<tr>
					<td><input type="checkbox" name="anniu" value="${s.sno}">
					</td>
					<td>${s.sno}</td>
					<td>${s.sname}</td>
					<%-- <td>${s.gender}</td> --%>
					<td><c:if test="${s.gender==0}">男</c:if>
						<c:if test="${s.gender==1 }">女</c:if></td>
					<td>${s.sbir}</td>
					<td>${s.hobby}</td>
					<td><img height='80px' src='/prc/${s.photo}'></td>
					<td><a href="delecteStudent.st?sno=${s.sno}">删除</a>&nbsp;<a
						href="modifiyStudentUI.st?sno=${s.sno}">修改</a></td>
				</tr>
			</c:forEach>

		</table>
		<input type="submit" value="删除">
	</form>

	<center>


		<a href="queryStudent2.st?curPage=1">首页</a> <a
			href="queryStudent2.st?curPage=${pt.lastPage}">上一页</a> <a
			href="queryStudent2.st?curPage=${pt.nextPage}">下一页</a> <a
			href="queryStudent2.st?curPage=${pt.countPage}">尾页</a> <input
			type="text" size="3" value="${pt.courrentPage}/${pt.countPage}" />当前页/总页数
		跳转到<input type="number" id="pagenum" />页<input type="button" id="btn"
			value="跳转" />

	</center>

	<%
		Cookie[] a = request.getCookies();
		if (a != null) {
			for (Cookie name : a) {
				if ("user".equals(name.getName())) {
					pageContext.setAttribute("name", name.getValue().split("&")[0]);

				}
			}
		}
	%>
	<br />
	<br />
	<br />
	

</body>
</html>