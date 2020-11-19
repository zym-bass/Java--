package com.ujiuye.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Test {

	public static void main(String[] args) throws Exception {
		
		
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		Connection conn = cpds.getConnection();
	}
}
