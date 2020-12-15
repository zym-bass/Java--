<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/15 0015
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js">
    </script>
    <script >
        function getPerson(){
            $.ajax({
                url:"${pageContext.request.contextPath}/PersonServlet",
                type:"post",
                data:{"id":$("#pid").val()},
                dataType:"json",
                cache:false,
                success:function(rs){
                    var oresult = rs.id+","+rs.name+","+rs.age;
                    $("#result").text(oresult);
                }
            });
        }
    </script>
</head>
<body>
    用户ID:<input type="text" id="pid">
    <input type="button" value="获取指定的Person对象" onclick="getPerson();"><br>
    结果：<span id="result"></span>

</body>
</html>
