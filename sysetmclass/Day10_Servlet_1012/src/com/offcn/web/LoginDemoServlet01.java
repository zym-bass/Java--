package com.offcn.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class LoginDemoServlet01 extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("s");
		String password = req.getParameter("b");
		System.out.println(name +"\t" +password);
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql="select * from s where sname=? and sno=? ";
	    User e;
		try {
			e = qr.query(sql, new BeanHandler<>(User.class),name,password);
			System.out.println(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	}
	
	
}