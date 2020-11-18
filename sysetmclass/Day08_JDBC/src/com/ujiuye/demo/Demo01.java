package com.ujiuye.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo01 {
	public static void main(String[] args)  {
		
		Connection con = null ;
		Statement  st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//注册驱动
		try {
			
			//获取连接对象
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","3333");
			System.out.println(con);
			
			
			//获取操作数据库对象
			st = con.createStatement();
			
			
			//执行sql语句
			String sql = "insert into emp values(9999,'韩妹妹','学生',1111,'1999-01-01',999,200,'39')";
		
			//将sql语句发送发数据执行
			int n =st.executeUpdate(sql);
			
			
			System.out.println(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//释放资源
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
