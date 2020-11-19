package com.yiming.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "http://www.baidu.com?userName=mike ";

        //通过响应对象，将地址赋值给响应头中location属性
        response.sendRedirect(result);
    }
    /*
    * 浏览器在接收到响应包之后，如果
    * 发现响应头中存储location属性
    * 自动通过地址栏向location指定网站发送请求
    * sendRedirect方法远程控制浏览器请求行为【请求行为，请求方式，请求参数】
    * */
}
