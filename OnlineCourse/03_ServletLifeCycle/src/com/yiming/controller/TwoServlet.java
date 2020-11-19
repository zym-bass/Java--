package com.yiming.controller;

import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends javax.servlet.http.HttpServlet {
    public TwoServlet(){
        System.out.println("TwoServlet类被创建实例对象");
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    /*
    * 问题描述：浏览器接收到数据是2，不是50
    *   问题原因：
    *       out.writer方法可以将【字符】,【字符串】，【ASCII码】写出到响应体中
    * */

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("TwoServlet-->doGet()方法执行");
        //String result = "50";//执行结果

        int result = 50 ;

        //-------响应对象将结果写入到响应体----start



        //1. 通过响应对象，向Tomcat索要输出流
        PrintWriter out =response.getWriter();
        //2. 通过输出流，将执行结果以而精致
        out.write(result);
        out.write(97);
        //-------响应对象将结果写入到响应体----start


        //在实际开发中，都是通过out.print()将真实数据写入带响应体中

        out.print(50);
    }//diG毕
    //Tomcat键响应包推送给浏览器
}
