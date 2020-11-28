<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/28 0028
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>局部刷新-AJAX</title>
    <script type="text/javascript">

        function doAjax() {
            //使用内存中的异步对象，代替浏览器发送请求。异步对象使用js创建和管理

            //1. 创建异步对象
            var xmlHttp = new XMLHttpRequest();
            //2. 绑定事件
            xmlHttp.onreadystatechange = function () {
                //处理服务端返回的数据，更新当前页面
                if(xmlHttp.readyState==4 && xmlHttp.status==200){
                    var data = xmlHttp.responseText;
                    //更新dom对象，更新页面数据
                    document.getElementById("mydata").innerText=data;
                }
            }

            //3. 初始请求数据
            var name = document.getElementById("name").value;
            var w = document.getElementById("w").value;
            var h = document.getElementById("h").value;
            var para = "name="+name+"&w="+w+"&h="+h;
            xmlHttp.open("get", "one?"+para, true);


            //4. 发起请求
            xmlHttp.send();
        }
    </script>
</head>
<body>
<p>
    <!-- 没有form -->
<div>
    姓名：<input type="text" id="name"/>
    体重（公斤）：<input type="text" id="w"/>
    身高（米）：<input type="text" id="h"/>
    <input type="button" value="计算bmi" onclick="doAjax()">
</div>
</p>
<p>
    <div id="mydata">
</div>
</p>
</body>
</html>
