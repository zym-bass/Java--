package com.ujiuye.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02 {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		Statement st = null;
		ResultSet re = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "3333");
			st = conn.createStatement();
			String sql = "select *from s  ";			
			re = st.executeQuery(sql);
			while (re.next()) {
				System.out.println("SNO:" + re.getInt("SNO") + "  SNAME:" + re.getString("SNAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(re!=null) {
				try {
					re.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(re!=null) {
				try {
					re.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}



	}
}
