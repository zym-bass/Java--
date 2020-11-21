package com.yiming.contorller;

import com.yiming.entity.Users;
import com.yiming.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            response.sendRedirect("index.html");
        }else {

            response.sendRedirect("login.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
