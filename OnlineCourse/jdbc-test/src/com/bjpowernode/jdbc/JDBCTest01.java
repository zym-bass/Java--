package com.bjpowernode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {
        public static void main(String[] args)  {
            //1. 注册驱动
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            Connection conn=null;
            Statement stmt = null;
            try{
                //注册驱动
                //方式一
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                //方式二
                Class.forName("com.mysql.jdbc.Driver");

                //2,获取连接
                String url = "jdbc:mysql://localhost:3306/bjpowernode";
                String user="root";
                String password="zym06220905";
                conn = DriverManager.getConnection(url,user,password);
                System.out.println("数据库连接对象"+conn);

                //3. 获取数据库对象
                stmt = conn.createStatement();
                //4. 执行sql语句
                String sql ="sql语句";
                //专门执行DML语句的（insert delete update）
                //返回值是“影响数据库中的记录条数”
                int count = stmt.executeUpdate(sql);
                System.out.println(count == 1 ? "保存成功" : "保存失败");
                //5. 处理查询集


            }catch(SQLException | ClassNotFoundException e){
                e.printStackTrace();
            }finally{

                //6. 释放资源
                //为了保证资源一定释方，在finally语句块中关闭资源
                //并且要遵守从小到大依次关闭
                //分别对其try..catch
                if(stmt != null){
                    try {
                        stmt.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if(conn != null){
                    try {
                        conn.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }
    }