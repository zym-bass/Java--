<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/22 0022
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="person" items="${personList}">
        ${person.id},${person.name},${person.gender},${person.age},${person.birthday}<br>
    </c:forEach>
</body>
</html>
