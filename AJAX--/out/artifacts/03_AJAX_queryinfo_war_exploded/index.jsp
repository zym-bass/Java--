<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/28 0028
  Time: 15:31
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
        xmlHttp.onreadystatechange=function(){
          //处理数据
          if( xmlHttp.readyState==4 && xmlHttp.status==200){
            var data = xmlHttp.responseText;
           /* alert(data);*/
            document.getElementById("name").value=xmlHttp.responseText;
           /* document.getElementById("jiancheng").innerText=data;*/

          }
        }
        var sno = document.getElementById("sno").value;

        //3. 初始异步请求对象
        xmlHttp.open("get","one?sno="+sno,true);
        //4. 发送请求
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

  </table>
  </body>
</html>
