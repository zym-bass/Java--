package com.yiming.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName ,money;
        //1. 调用请求对象读取【请求头】参数信息
        userName = request.getParameter("userName");
        money = request.getParameter("money");
        //2. 开卡
        Cookie card1 = new Cookie("userName",userName);
        Cookie card2 = new Cookie("money", money);
        card2.setMaxAge(300);
        //3. 发卡
        response.addCookie(card1);
        response.addCookie(card2);
        //4. 通知浏览器【点餐页面】内容写入到响应体交给浏览器
        request.getRequestDispatcher("/index2.html").forward(request,response);
      /*  response.sendRedirect("index2.html");*/

    }
}
