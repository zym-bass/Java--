<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="modifiyStudent1.st" method="post" enctype="multipart/form-data">
	<input type="text" name="sno" value="${s.sno}" checked="checked"/>
   	  姓名:<input type="text" name="sname" value="${s.sname}" checked="checked"/><br><br><br>
   	 生日:<input type="date" name="sbir" value="${s.sbir}" checked="checked" /><br/><br><br>
   	性别:<input type="radio" name="gender" value="0" <c:if test="${s.gender==0}">checked="checked"</c:if>/>男
   	<input type="radio" name="gender" value="1" <c:if test="${s.gender==1}">checked="checked"</c:if>/>女
   	<br>
   	<br>
   	<br>
   	 爱好:
	   	打豆豆<input type="checkbox" name="hobby" value="嘤嘤嘤" <c:if test="${f:contains(s.hobby,'嘤嘤嘤')}">checked="checked"</c:if>/>
	   	吃饭<input type="checkbox" name="hobby" value="略略略" <c:if test="${f:contains(s.hobby,'略略略')}">checked="checked"</c:if>/>
	   	睡觉<input type="checkbox" name="hobby" value="哈哈哈" <c:if test="${f:contains(s.hobby,'哈哈哈')}">checked="checked"</c:if>/>
	   	打豆豆<input type="checkbox" name="hobby" value="嗷嗷嗷" <c:if test="${f:contains(s.hobby,'嗷嗷嗷')}">checked="checked"</c:if>/><br/><br>
	  头像:<input type="file" name="photo"/><br/><br><br>
   	 <input type="submit" value="修改信息"/>
   </form>
</body>
</html>