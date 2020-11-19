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
	//�����ݿ����һ������
	public void add() throws Exception {
		//����QueryRenner����
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "insert into s values(?,?)";
		Object[] params = {40,"��һ��"};
		int  n = qr.update(sql, params);
		
	}
	/*@Test*/
	//�޸�һ��Ԫ��
	public  void set() throws Exception {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql = "update s set sname=?  where sno = ?";
		int s =qr.update(sql, "���һ��",20);
		
	}
/*	@Test*/
	//ɾ��һ��Ԫ��
	public void del() throws SQLException {
		QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
		String sql ="delete from s where sno=?";
		int s = qr.update(sql,20);
		System.out.println(s);
	}

	/*@Test*/
	// ��ѯԪ�� ���в�ѯ
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
