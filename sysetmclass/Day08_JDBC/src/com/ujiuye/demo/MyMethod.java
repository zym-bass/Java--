package com.ujiuye.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyMethod {
	static String diverClass ;
	static String dbUrl;
	static String username;
	static String password;
	 private MyMethod() {};
	 static {
		 Properties p = new Properties();
		 try {
			p.load(MyMethod.class.getClassLoader().getResourceAsStream("db.properties"));
		
			
			diverClass = p.getProperty("diverClass");
			dbUrl = p.getProperty("dbUrl");
			username = p.getProperty("username");
			password = p.getProperty("password");
			Class.forName(diverClass);
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public  static  Connection  getCon() throws SQLException {
	
		return DriverManager.getConnection(dbUrl,username,password);
		
	 }
	 public static void getclose(Connection conn , Statement st , ResultSet re){
		 if(conn!=null) {
			 try {
				conn.close();
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
		 if(re!=null) {
			 try {
				re.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}
