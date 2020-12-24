<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/24 0024
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <script src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>

</head>
<body>
    <form action="${pageContext.request.contextPath}/addUser" method="post">
        姓名：<input type="text" name="name"><br>
        出生日期:<input type="text" name="birthday" id="birthday" onfocus="WdatePicker({el:'birthday'})" readonly="readonly"/><br>
        性别：
        <input type="radio" name="gender" value="男" checked>男
        <input type="radio" name="gender" value="女">女
        <br>
        年龄：<input type="text" name="age" ><br>
        <input type="submit" value="注册">
    </form>

</body>
</html>
