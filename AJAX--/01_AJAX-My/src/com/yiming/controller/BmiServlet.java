package com.yiming.controller;

import java.io.IOException;

public class BmiServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //接收请求参数
        String name = request.getParameter("name");
        String w = request.getParameter("w");
        String h = request.getParameter("h");
        /*System.out.println(w);
        System.out.println(h);*/
        //计算bmi：bmi =体重/身高的平方
        /*Float ww = Float.valueOf(w);
        Float hh = Float.valueOf(h);*/
        float bmi =  Float.valueOf(w) /(Float.valueOf(h)*Float.valueOf(h));

        //判断bmi的范围
        String msg =null;
        if(bmi>32){
            msg="非常肥胖";
        }else if(bmi>28){
            msg = "肥胖";
        }else if(bmi>24){
            msg = "过重";
        }else if(bmi>18.5){
            msg = "正常";
        }else {
            msg = "过轻";
        }
        msg ="您好："+name+"先生/女士，您的bim值是："+bmi+","+msg;
        //把数据存入到request
        request.setAttribute("msg",msg);
        System.out.println(msg);
        //转发到新的页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }
}
