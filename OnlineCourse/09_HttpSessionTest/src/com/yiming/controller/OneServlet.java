package com.yiming.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1.调用请求对象读取请求参数，获取用户选择的商品那个名
        String goodsName  = request.getParameter("goodsName");
        HttpSession session = request.getSession();
        PrintWriter out = null;
        Integer numbers = null;
        if((numbers= (Integer)session.getAttribute(goodsName))!=null){
            System.out.println(goodsName);
            session.setAttribute(goodsName,numbers+1);
        }else {
            System.out.println(goodsName);
            numbers=1;
            session.setAttribute(goodsName ,numbers );
        }
       /* response.sendRedirect("index.html");*/
       /* response.setContentType("text/html;charset=utf-8");*/
      /* request.getRequestDispatcher("index.html").forward(request,response);*/
    }
}
