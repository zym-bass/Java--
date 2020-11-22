package com.yiming.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1. 获取Tomcat全局作用域变量
        ServletContext application = request.getServletContext();
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        Integer integer =(Integer)application.getAttribute("key1");
       /* System.out.println(integer);*/
        System.out.println("1231");
        out.print(integer);
    }
}
