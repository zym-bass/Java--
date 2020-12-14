package com.yiming.daoImpl;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yiming.dao.StudentDao;
import com.yiming.entity.StudentClass;

public class StudentImpl implements StudentDao {

	@Override
	public List<StudentClass> getStudent() {
		//获取驱动
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql:///bjpowernode");
			dataSource.setUser("root");
			dataSource.setPassword("3333");
			QueryRunner qr = new QueryRunner(dataSource);
			return qr.query("select * from s", new BeanListHandler<>(StudentClass.class));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
