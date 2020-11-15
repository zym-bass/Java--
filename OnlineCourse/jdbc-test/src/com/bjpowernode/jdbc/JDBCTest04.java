package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest04 {
    public static void main(String[] args) {
        //用户在控制台输入desc 就是降序 ，输入asc就是升序
        System.out.println("请选择升序还是降序");
        String sort = new Scanner(System.in).nextLine();

        Connection conn = null;
        Statement st =null;
        ResultSet re = null;
        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode"
            ,"root","zym06220905");
            //3. 获取数据库对象
            st = conn.createStatement();
            //4. 执行sql语句
            String sql = "select *from t_user order by loginPwd "+sort;
            System.out.println(sql);
            re = st.executeQuery(sql);

            //5. 处理查询结果集
            while(re.next()){
                System.out.println(re.getString("id") +"\t"+ re.getString("loginName") +"\t"+ re.getString("loginPwd") + "\t"+re.getString("realName"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            if (re!=null){
                try {
                    re.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (st!=null){
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}
