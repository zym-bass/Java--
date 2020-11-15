package com.bjpowernode.jdbc;

import java.sql.*;

/**
 * JDBC事务机制
 *      1. JDBC中的事务是自动提交的，什么是自动提交的？
 *          只要执行任意一条DML语句，则自动提交一次，这是JDBC默认的事务行为
 *          但是在实际的业务当中，通常都是DML语句共同联合才能完成的，必须
 *          保证他们这些DML语句在同一个事务中同时成功或者同时失败
 */
public class DButil {

    /**
     * 工具类中的构造方法都是私有的
     * 因为工具类当中的方法都是静态的，不需要new对象，直接采用类名调用
     */
    private DButil(){

    }


    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得数据库对象
     * @return 返回连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","zym06220905");
    }


    /**
     *
     * @param conn  数据库连接对象
     * @param ps    数据库操作对象
     * @param rs    数据库处理结果集
     */
    public static void close(Connection conn, Statement ps, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){

            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
}
