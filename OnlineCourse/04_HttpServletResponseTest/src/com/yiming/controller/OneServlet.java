package com.yiming.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String result = "Java<br/>Mysql<br/>Mysql<br/>";
        String result2 = "小男童<br/>+<br/>小女孩<br/>";

        //设置响应头content-type
        response.setContentType("text/html;charset=UTF-8");
        //向TomcatUS索要输出流
        PrintWriter pw = response.getWriter();
        //通过输出流将结果写入到响应体
        pw.write(result);
        pw.write(result2);

    }
}
