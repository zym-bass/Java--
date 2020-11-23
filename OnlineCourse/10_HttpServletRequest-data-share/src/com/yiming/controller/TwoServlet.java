package com.yiming.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //从同一个请求作用域对象得到OneServlet写入到共享数据
        String value = (String)request.getAttribute("key1");
        System.out.println("TwoServlet得到共享数据"+value);

    }
}
