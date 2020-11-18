package com.ujiuye.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03{
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = MyMethod.getCon();
			System.out.println(conn);
			//ps = conn.prepareStatement("update s set sno=100 where sname=?");
			//ps.setString(1, "Ò»Ãû");
			//int i = ps.executeUpdate();
			//System.out.println(i);
			String sql = "select sno from s ";
			ps = conn.prepareStatement("select sno from s ");
			//rs = ps.executeQuery();
			//System.out.println();
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

