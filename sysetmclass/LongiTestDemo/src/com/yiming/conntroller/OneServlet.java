package com.yiming.conntroller;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.offcn.GetConn;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
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
	/*
	 * private ComboPooledDataSource ds = null; private OneServlet(){ ds =new
	 * ComboPooledDataSource(); }
	 */

	/*
	 * Connection conn = null;
	 * 
	 * @Override public void init(ServletConfig config) throws ServletException {
	 * config = }
	 */

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		QueryRunner qr = new QueryRunner();

//        Connection conn = GetConn.getConnection();
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		int password = Integer.valueOf(req.getParameter("password"));

		System.out.println(username + "---" + password);
		
		/* doSome(username,password); */
		
			String sql = "select sname from s where sname=? and sno=? ";
			try {
				System.out.println(qr.query(sql, new BeanHandler(String.class),username, password));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (qr.query(sql, new BeanHandler(String.class),username, password) != null) {
				
					System.out.println("登陆成功");
				} else {
					System.out.println("登录失败");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
}
