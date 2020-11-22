package com.yiming.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1.通过请求对象向Tomcat索要全局作用域对象
        ServletContext application = request.getServletContext();
        //2.向全局作用域对象存放数据
        application.setAttribute("key1",123);
        RequestDispatcher report = request.getRequestDispatcher("/two");
        report.forward(request,response);
        System.out.println("111111111111");
    }
}
