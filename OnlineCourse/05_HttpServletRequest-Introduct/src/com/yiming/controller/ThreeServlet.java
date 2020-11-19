package com.yiming.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*  问题：
*   以GET方式发送中午参数内容“中文”时，得到正常结果
*   以POST方式发送中文参数内容,得到【乱码】
*  原因：
*   浏览器以GET方式发送请求，请求参数保存在【请求头中】，在Http请求协议包到达Http服务器之后，第一件事就是解码
*   请求头二进制内容由Tomcat负责解码，与Tomcat使用的编码集有关
*
*   浏览器以POST方式发送请求，请求参数保存在【请求体】，在Http请求协议包到达Http服务器之后，第一件事就是解码
*   请求体二进制内容由当前请求对象（request）负责解码 ，request默认使用[ISO-8859-1]字符集，
*
*   解决方案：
*       在POST请求方式下，在读取请求体内容之前，应该通知请求对象使用UTF-8字符集请求体中的内容来重新解码
*
*
*
* */


public class ThreeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通知请求对象，使用UTF-8字符集对请求体二进制内容进行一下重新解码
        request.setCharacterEncoding("utf-8");
        //通过请求对象，读取【请求体】参数信息
        String value =request.getParameter("username");
        System.out.println("从请求体中得到的参数"+value);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过请求对象，读取【请求头】参数信息
        String userName =request.getParameter("username");
        System.out.println("从请求头中得到参数值"+userName);
    }
}