package com.offcn.demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.offcn.bean.Params;

public class DbutilsTest01 {
	/*@Test*/
	//在数据库添加一个对象
	public void add() throws Exception {
		//创建QueryRenner对象
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "insert into s values(?,?)";
		Object[] params = {40,"大一名"};
		int  n = qr.update(sql, params);
		
	}
	/*@Test*/
	//修改一个元素
	public  void set() throws Exception {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "update s set sname=?  where sno = ?";
		int s =qr.update(sql, "大大一名",20);
		
	}
/*	@Test*/
	//删除一个元素
	public void del() throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql ="delete from s where sno=?";
		int s = qr.update(sql,20);
		System.out.println(s);
	}

	/*@Test*/
	// 查询元素 单行查询
	public void dql() throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "select *from s where sno=2 ";
		Params p = qr.query(sql, new BeanHandler<>(Params.class));
		System.out.println(p);
	}
	@Test
	public void dqls() throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "select  * from s";
		List<Params> s = qr.query(sql,new  BeanListHandler<>(Params.class));
		System.out.println(s);
	}
}
