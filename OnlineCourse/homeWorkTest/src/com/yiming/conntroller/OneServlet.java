package com.yiming.conntroller;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.offcn.GetConn;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OneServlet extends HttpServlet {
    /*private ComboPooledDataSource ds = null;
    private OneServlet(){
        ds =new ComboPooledDataSource();
    }*/


    /*Connection conn = null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        config =
    }*/


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        QueryRunner queryRunner = new QueryRunner();

//        Connection conn = GetConn.getConnection();
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        System.out.println(username + "---" + password);

        /*doSome(username,password);*/
        PreparedStatement ps = null;
        ResultSet rs = null;
        /*try {
            String sql = "select * from s where sname=? and sno=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setInt(2,Integer.valueOf(password));
            rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("sname"));
                System.out.println(rs.getString("sno"));
                System.out.println("登陆成功");
            }else {
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
    }
    /*@Test
    public  void doSome( ){
        String username = "wefw";
        String password="1";
        Connection conn = GetConn.getConnection();

        System.out.println(username+"---"+password);

        *//*doSome(username,password);*//*
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from s where sname=? and sno=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setInt(2,Integer.valueOf(password));
            rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("sname"));
                System.out.println(rs.getString("sno"));
                System.out.println("登陆成功");
            }else {
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }




