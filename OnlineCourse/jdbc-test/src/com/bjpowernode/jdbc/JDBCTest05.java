package com.bjpowernode.jdbc;

import java.sql.*;

public class JDBCTest05 {
    public static void main(String[] args) {
        //JDBC

        Connection conn =null;
        PreparedStatement ps = null;

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","zym06220905");
            //获取预编译数据库对像
            /*String sql = "insert into dept(deptno , dname , loc ) values(?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,60);
            ps.setString(2,"销售部");
            ps.setString(3,"上海");*/
            String sql = "delete from dept where deptno=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,60);
            int count = ps.executeUpdate();
            System.out.println(count);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps!=null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }
}
