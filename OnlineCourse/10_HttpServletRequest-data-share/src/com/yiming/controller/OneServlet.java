package com.yiming.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1. 将数据添加到请求作用域对象，作为共享数据
        request.setAttribute("key1","hello World");
        //2. 代替浏览器，先Tomcat索要TwoServlet来完成剩余任务
        request.getRequestDispatcher("/two").forward(request,response);

    }
}
