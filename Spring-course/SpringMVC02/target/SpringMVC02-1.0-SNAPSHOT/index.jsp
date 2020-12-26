<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/25 0025
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="${pageContext.request.contextPath}/dosome.do">点一下</a>
    <form  action="dosome.do" method="post">
        <input type="submit" value="点一点">
    </form>

    <form action="url4" method="post">
        姓名：<input type="text" name="name"><br>
        性别：<input type="text" name="gender"><br>
        年龄：<input type="text" name="age"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
