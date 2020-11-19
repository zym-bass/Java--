package com.yiming.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1. 通过请求对象，读取【请求行】中【url】信息
        String url =request.getRequestURL().toString();

        //2. 通过请求你对象，读取【请求行】中【method】信息
        String method =request.getMethod();

        //3. 通过请求对象，读取【请求行】中uri信息
        /*
        * URI：资源文件精准对位地址，在请求行并没有URI这个属性
        *   实际上URI中截取一个字符串，
        *   格式：“/网站名/资源文件名”
        *   URI用于让Http服务器对访问的资源文件进行定位
        * */
        String uri = request.getRequestURI();

        // 通过请求对象，读取URL和method
        System.out.println("Request URL:" + url);
        System.out.println("Request Method:" + method);
        System.out.println("Request URI:" + uri);

    }
}
