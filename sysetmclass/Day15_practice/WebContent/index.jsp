<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="jquery.js" charset="utf-8" ></script>
	<script type="text/javascript" >
		$(function(){
			$("#d1").blur(function(){
				$.ajax({
					//请求路径
					url:"one",
					//请求参数
					data:{"name":$(this).val()},
					//请求方式
					type:"post",
					//服务器返回的数据格式
					dataType:"text",
					
					//obt服务器响应的数据
					success:function(obt){
						alert(obt)
						if(obt=="true"){
							$("#name_msg").html("√").css("color","green");
						}else{
							$("#name_msg").html("x").css("color","red");
						}
					}
				});
				
			});
		});
		$(function(){
			$("#id").click(function(){
				$.ajax({
					//请求路径
					url："",
					//请求参数
					data:{"name":$(this).val},
					//请求方式
					type:"post"
					//服务器返回的数据类型
					dataType:"json",
					
					//obt服务器响应的数据
					success:function(obt){
						//由于是json对象的字符串 使用obt.参数名获取值
					}
				})
			})
		})
	</script>
</head>
<body>
 用户名：<input name="username" id="d1"><span id="name_msg"></span>
</body>
</html>