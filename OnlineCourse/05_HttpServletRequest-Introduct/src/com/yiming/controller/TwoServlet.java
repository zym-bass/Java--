package com.yiming.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 通过请求对象获得【请求头】中【所有参数名称】
        Enumeration<String> paramNames = request.getParameterNames();//将所有参数的名称返回到枚举对象进行返回
        while(paramNames.hasMoreElements()){
            String paramName = paramNames.nextElement();

            //2.通过请求对象读取指定的请求参数的值
            String parameter = request.getParameter(paramName);
            System.out.println("请求参数："+paramNames.nextElement()+":"+parameter);

        }
    }
}
