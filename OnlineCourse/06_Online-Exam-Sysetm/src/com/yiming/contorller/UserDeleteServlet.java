package com.yiming.contorller;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yiming.utils.UserDao;
import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 【调用请求对象】读取【请求头】参数（用户编号）
        String userId ;
        UserDao dao = new UserDao();
        int result = 0 ;
        PrintWriter out = null;
        response.setContentType("text/html;charset=UTF-8");
        userId= request.getParameter("userId");
        System.out.println(userId);
        //2. 【调用DAO】将用户编号填充到delete命令并执行sql语句删除数据库服务器
        result = dao.delete(userId);
        //3. 【调用响应对象】将处理结果以二进制写入到响应体，交给浏览器
        out = response.getWriter();
        if(result==1){
            out.print("<font style='color:red;font-size:40'>用户删除成功</font>");
        }else {
            out.print("<font style='color:red;font-size:40'>用户删除失败</font>");
        }
    }
}