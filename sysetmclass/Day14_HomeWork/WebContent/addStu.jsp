<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addStudent.st" method="post" enctype="multipart/form-data">
   	  姓名:<input type="text" name="sname"/><br><br><br>
   	 生日:<input type="date" name="sbir"/><br/><br><br>
   	性别:<input type="radio" name="gender" value="0"/>男<input type="radio" name="gender" value="1"/>女
   	<br>
   	<br>
   	<br>
   	 爱好:
	   	打豆豆<input type="checkbox" name="hobby" value="嘤嘤嘤"/>
	   	吃饭<input type="checkbox" name="hobby" value="略略略"/>
	   	睡觉<input type="checkbox" name="hobby" value="哈哈哈"/>
	   	打豆豆<input type="checkbox" name="hobby" value="嗷嗷嗷"/><br/><br>
	  头像:<input type="file" name="photo"/><br/><br><br>
   	 <input type="submit" value="添加学生"/>
   </form>
</body>
</html>