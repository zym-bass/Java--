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
		
		//ע������
		try {
			
			//��ȡ���Ӷ���
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","3333");
			System.out.println(con);
			
			
			//��ȡ�������ݿ����
			st = con.createStatement();
			
			
			//ִ��sql���
			String sql = "insert into emp values(9999,'������','ѧ��',1111,'1999-01-01',999,200,'39')";
		
			//��sql��䷢�ͷ�����ִ��
			int n =st.executeUpdate(sql);
			
			
			System.out.println(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ͷ���Դ
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
