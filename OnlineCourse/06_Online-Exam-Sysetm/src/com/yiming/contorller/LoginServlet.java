package com.yiming.contorller;

import com.yiming.entity.Users;
import com.yiming.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*Thread  s = new Thread(new Runnable() {
            @Override
            public void run() {
                PrintWriter out = null;
                try {
                    System.out.println("执行了");
                    response.setContentType("text/html; charset=utf-8");
                    out = response.getWriter();
                    out.print("<font style='color:red;font-size:40'>欢迎来到一名管理系统，3s后进入</font>");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });*/

        UserDao dao = new UserDao();
        Users user = null;
        String username ,password ;
        //1. 调用请求对象对请求体使用UTF-8字符集进行重新编译
        request.setCharacterEncoding("utf-8");
        username = request.getParameter("username");
        password = request.getParameter("password");

        //2. 通过参数与数据库数据对应执行sql语句
        user = dao.login(username,password);

        //3. 获取【响应对象】是将内容以二进制文件传输给浏览器
        response.setContentType("text/html;charset=utf-8");
        if (user!=null){
           /* s.start();*/
            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            /*System.out.println("main执行");*/
            response.sendRedirect("index.html");
        }else {

            response.sendRedirect("login.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
