package com.yiming.contorller;

import com.yiming.entity.Users;
import com.yiming.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserFindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        PrintWriter out = null;
        //修改响应头内容类型
        response.setContentType("text/html;charset=utf-8");
        //调用【find】将所有用户信息返回到List集合中
        List<Users> list = dao.find();
        /*for (Users s:list
             ) {
            System.out.println(s);
        }*/
        out = response.getWriter();
        out.print("<table border=\"2\" align=\"center\">");
        out.print("<tr>");
        out.print("<td>用户编号</td>");
        out.print("<td>用户名字</td>");
        out.print("<td>用户密码</td>");
        out.print("<td>用户性别</td>");
        out.print("<td>用户邮箱</td>");
        out.print("<td>操作</td>");
        out.print("<tr>");
        for (Users users : list) {
            out.print("<tr>");
            out.print("<td>" + users.getUserId() + "</td>");
            out.print("<td>" + users.getUserName() + "</td>");
            out.print("<td>" + users.getPassword() + "</td>");
            out.print("<td>" + users.getSex() + "</td>");
            out.print("<td>" + users.getEmail() + "</td>");
            out.print("<td><a style='text-decoration: none'  href='delete?userId="+users.getUserId()+"'>删除用户<a/></td>");
            out.print("<tr>");
        }

    }
}
