package com.ujiuye.dbcp;

import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

public class DbcpTest {
	@Test
	public void doSome() throws Exception {
		Properties p = new  Properties();
		p.load(DbcpTest.class.getClassLoader().getResourceAsStream("dbcp.properties"));
		
		DataSource ds = BasicDataSourceFactory.createDataSource(p);
		
		Connection con = ds.getConnection();
		System.out.println(con);
	}
}
