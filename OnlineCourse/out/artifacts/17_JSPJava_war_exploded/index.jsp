<%@ page import="com.yiming.entity.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/25 0025
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--在JSJP文件中不能直接书写Java命令-->

<%
  //在JSP文件中，只有书写在执行标记中内容才会被当前Java命令
  //1.声明Java变量
  int num1 =100;
  //2.声明运行表达式，数学运算，关系运算，逻辑运算
  int num3 = num1+num1;
  //3.声明控制语句

%>
<!--在JSP文件，通过输出标记，通知JSP将Java变量的值写入到响应体中-->
变量num1的值<%=num1%><br/>
变量num3的值<%=num3%><br/>
<!--执行标记还可以通知JSP将运算结果写入到响应体中-->
num1 + num2 = <%=num1+num3%>

<%  new Student(); %>
