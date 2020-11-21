package com.yiming.contorller;

import com.yiming.entity.Users;
import com.yiming.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class UseraddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username ,password,sex , email ;
        UserDao dao  = new UserDao() ;
        Users user = null ;
        int result = 0;
        PrintWriter  out = null;

        //1. 【调用请求对象】读取【请求头】参数信息，得到用户的信息
        username = request.getParameter("username");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");

        //2. 将用户信息与数据库连接执行sql语句

        //2. 【调用C3p0dbutilsDao】将用用户信息填充到insert命令中（DML）发送给数据库服务器
        user=new Users(null,username,password,sex,email);
        try {
            result = dao.add(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html;charset=UTF-8");

        //3. 【调用响应对象】将【处理结果】以二进制形式写入到响应体中
        out =response.getWriter();

        //响应体修改对象内容类型


        if(result==1){
         /*   out.print("<font style='color:red;font-size:40'>注册成功,3秒后进行一名管理系统。</font>");*/
           response.sendRedirect("/index.html");
        }else {
            out.print("<font style='color:red;font-size:40'>注册失败</font>");
        }
    }

    //Tomcat负责销毁【请求对象】和【响应对象】
    //Tomcat负责将Http响应协议包推送到发送请求的浏览器上
    //浏览器根据响应头content-type指定编码器对响应二进制内容进行编辑
    //浏览器将编辑后结果在窗口中展示给用户【结束】

}
