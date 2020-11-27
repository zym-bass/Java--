<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.List,entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<script src="jquery.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function() {
				//点击按钮获取选中复选框的值
				var a = true;
				$("#btn").click(function() {
					$arr = $("input:checkbox");
					/* console.log($arr.length); */
					$arr.each(function(i , dom){
						$(dom).prop("checked",a);	
					})
					if(a==true){
						a=false
					}else{
						a=true;
					}
					console.log(a);
				});

				/* $("#btn").click(function() {
					//获取复选框标签的name属性值
					console.log("attr方式获取:" + $("input:checkbox").attr("name"));
					console.log("prop方式获取:" + $("input:checkbox").prop("name"));
					//获取复选框标签的ddk的属性值
					console.log("attr方式获取:" + $("input:checkbox").attr("ddk"));
					console.log("prop方式获取:" + $("input:checkbox").prop("ddk"));
					//选中复选框
					//$("input:checkbox").prop("checked","checked");
					$("input:checkbox").prop("checked", true);
					//修改按钮的样式
					$(this).prop("style", "background-color:red;height:80px;width:100px;");
				}); */

			});
		</script>


<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td,th{
	  width: 188px;
	  text-align: center;
	  height: 100px;
	}
</style>

	<script type="text/javascript">
	
	</script>

</head>
<body>
	<%
		List<Student> list = (List<Student>)request.getAttribute("list");
	%>
	<form action="quanxuan" >
	<table border="1px" width="60%" align="center" cellpadding="0"
		cellspacing="0">
		
		<tr>
			<th>全选或全不选<input type="button" id="btn" value="点击" /></th>
			<th>编号</th>
			<th>姓名</th>
			<th>生日</th>
			<th>爱好</th>
			<th>头像</th>
		</tr>
		<%
			
			for (Student s : list) {
		%>
		<tr>
			<td>
				<input type="checkbox" name="anniu" value="<%=s.getSno()%>">
			</td>
			<td><%=s.getSno() %></td>
			<td><%=s.getSname() %></td>
			<td><%=s.getSbir() %></td>
			<td><%=s.getHobby() %></td>
			<td><img height='80px' src='/prc/<%=s.getPhoto()%>'></td>
			<td><a href="DelecteStudent?sno=<%=s.getSno()%>">删除</a></td>
		</tr>
		<%
				
			}
		%>
	</table>
	<input type="submit" value="删除">
</form>
</body>
</html>