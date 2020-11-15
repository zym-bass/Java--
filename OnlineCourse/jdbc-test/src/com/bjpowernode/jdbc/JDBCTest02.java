package com.bjpowernode.jdbc;

/*
    实现功能：
        1. 需求：模拟用户登录功能的实现
        2. 业务描述：
            程序运行的时候，提供一个输入的入口，可以让用户输入用户名和密码
            用户输入用户名和密码之后，提交信息，Java程序收集到用户信息
            Java程序连接数据库验证用户名和密码是否合法
            合法：显示登录成功
            不合法：显示登录失败
        3. 数据的准备
            在实际开发中的，表的设计使用的专门的建模工具，
            我们这里安装一个建模工具：powerDesigner
            使用PD工具进行数据库表的设计。
        4. 导致SQL注入的根本原因是什么？
            用户输入得信息中含有sql语句的关键字，并且这些关键字参与sql语句的编译过程
            导致sql语句的愿意被扭曲，进而达到sql注入

*/

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest02 {
    public static void main(String[] args) {

        //初始化一个界面

        Map<String , String> userLoginInfo = initUI();

        //验证用户名和密码
        boolean  loginSuccess = login(userLoginInfo);
        //最后输出结果
        System.out.println(loginSuccess ? "登录成功" : "登录失败");


        try {
            Class.forName("com.mysql.jdbc.Driver");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 用户登录
     * @param userLoginInfo 用户登录信息
     * @return  false登录失败 ，true登录成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        //打标机意识
        boolean loginSuccess = false;
        //编写JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;

        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","zym06220905");
            //3. 获取数据库对象
            stmt = conn.createStatement();
            //4. 执行sql语句
            String sql = "select *from t_user where loginName='"+userLoginInfo.get("loginName")+"' and loginPwd='"+userLoginInfo.get("loginPwd")+"'";
            re =stmt.executeQuery(sql);
            //5. 处理查询结果集

            while (re.next()){
                loginSuccess=true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            //6. 释放内存
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(re!=null){
                try {
                    re.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }


        return loginSuccess;
    }


    /**
     * 初始化用户界面
     * @return 用户输出的用户名和密码等登陆信息
     */
    private static Map<String, String > initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名：");
        String username = s.nextLine();

        System.out.println("密码：");
        String password = s.nextLine();

        Map<String , String > userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName",username);
        userLoginInfo.put("loginPwd",password);

        return userLoginInfo;
    }
}
