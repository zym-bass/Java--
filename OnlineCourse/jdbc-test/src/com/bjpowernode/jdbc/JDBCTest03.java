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
        5. 解决SQL注入的关键是什么？
            用户提供的信息中即使含有sql语句的关键字，但是这些关键字并没有参与编译。不起作用
        6. 对比一下Statement和PreparedStatement？
            * Statement存在sql注入问题，PreparedStatement解决了SQL注入问题
            * Statement是编译一次执行一次。PreparedStatement是编译一次，可执行n次。PreparedStatement效率高
            * PreparedStatement 会在编译阶段做类型的安全检查
        5. 什么情况下必须使用Statement呢？
            业务方面要求必须支持SQL注入的时候
            Statement支持SQL注入，凡是业务方面要求是需要进行sql语句拼接的，必须使用Statement
*/

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 解决SQL注入的问题
 *  只有用户提供的信息不参与SQL语句的编译过程，问题就解决了
 *  即使用户提供的信息中含有SQL语句的关键字，但是没有参与编译，不起作用
 *  要想用户信息不参与SQL语句的编译，那么必须使用java.sql,PreparedStatement
 */
public class JDBCTest03 {
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
        PreparedStatement ps = null;
        ResultSet re = null;

        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","zym06220905");
            //3. 获取预编译的数据库对象
            //SQL语句的框子，其中一个？，表示一个占位符，一个？将来接收一个“值”，注意：占位符不能使用单括号括起来
            String sql = "select *from t_user where loginName=?  and loginPwd=?";
            //程序执行到此处，会发送给sql语句框子给DBMS，然后DBMS进行sql语句的预先编译
            ps = conn.prepareStatement(sql);
            //给占位符？传值（第1个问号下标是1 ， 第2个问号下标是2,JDBC中所有下标从1开始）
            ps.setString(1,"loginName");
            ps.setString(2,userLoginInfo.get("loginPwd"));

            //4. 执行sql语句
            re = ps.executeQuery();
            //5. 处理查询结果集
            while (re.next()){
                loginSuccess=true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            //6. 释放内存


            if(re!=null){
                try {
                    re.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(ps !=null){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
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

