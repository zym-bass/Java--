<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/28 0028
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>省份查询</title>
    <script type="text/javascript">
        function doAjax(){
            //1. 创建异步对象
            var xmlHttp = new XMLHttpRequest();
            //2. 绑定事件
            xmlHttp.onreadystatechange = function(){
                if(xmlHttp.readyState==4 && xmlHttp.status==200){
                    var data = xmlHttp.responseText;
                    //eval是执行括号中的代码，把json字符串转为json对象
                    var jsonobj = eval("("+data+")");

                    /*  alert(data);*/
                    //更新dom对象
                    document.getElementById("name").value=jsonobj.name;
                    document.getElementById("jiancheng").value=jsonobj.jiancheng;
                    document.getElementById("shenghui").value=jsonobj.shenghui;

                }
            }
            var sno = document.getElementById("sno").value;
            //3.初始异步请求对象
            xmlHttp.open("get","two?sno="+sno,true);

            //4.发送请求
            xmlHttp.send();
        }
    </script>

</head>
<body>
<table  align="center">
    <tr>
        <td>省份编号：</td>
        <td><input type="text" id="sno"  /></td>
        <td><input type="button" value="搜索"  onclick="doAjax()"></td>
    </tr>
    <tr>
        <td>省份名称：</td>
        <td><input type="text" id="name"  value="" /></td>
    </tr>
    <tr>
        <td>省份简称：</td>
        <td><input type="text" id="jiancheng" value=""  /></td>
    </tr>
    <tr>
        <td>省份名称：</td>
        <td><input type="text" id="shenghui" value=""  /></td>
    </tr>

</table>
</body>
</html>
