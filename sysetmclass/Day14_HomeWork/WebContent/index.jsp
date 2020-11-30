<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Login.css"/>
</head>
<body>
<%
		Cookie[] a = request.getCookies();
		if (a != null) {
			for (Cookie name : a) {
				if ("user".equals(name.getName()) && !"".equals(name.getValue())) {
					pageContext.setAttribute("name", name.getValue().split("&")[0]);
					pageContext.setAttribute("sbir", name.getValue().split("&")[1]);

				}
			}
		}
	%>
<div id="login">
    <h1>Login</h1>
    <form method="post" action="login.st">
        <input type="text" required="required" placeholder="用户名" name="u" value="${pageScope.name}" ></input>
        <input type="password" required="required" placeholder="生日" name="p" value="${pageScope.sbir}" ></input>
        <button class="but" type="submit">登录</button>
    </form>
</div>
</body>
</html>