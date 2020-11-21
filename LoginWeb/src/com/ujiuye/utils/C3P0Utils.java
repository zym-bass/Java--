/*
 * c3p0连接池工具类
 * 
 * 
 * */
package com.ujiuye.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	 
	private static DataSource ds=new ComboPooledDataSource();
	
	
	//获取连接池
	public static DataSource getDataSource(){
		
		return ds;
	}
	
	//获取连接
	public static Connection getConnection(){
		
		Connection conn=null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**测试
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = getConnection();
		System.out.println(conn);
	}
	
	
	// 释放资源
		public static void closeAll(Connection conn, Statement state, ResultSet rs) {

			if (conn != null) {

				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (state != null) {

				try {
					state.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {

				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
