package com.offcn.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.offcn.entity.Page;
import com.offcn.entity.Register;
import com.offcn.utils.JdbcUtils;

public class RegisterDao {
	private static StringBuffer sqllike = new StringBuffer("select *from register where 1=1 "); 
	//添加挂号信息
	public int addRegister(Object[] register) {
		String sql = "insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			return JdbcUtils.qr.execute(sql, register);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	//模糊查询拼接sql语句
	public void likesql(String rid, String name, String department) {
		// TODO Auto-generated method stub
		sqllike.delete(31, sqllike.length());
		
		if( rid!=null && !"".equals(rid) ) {
			sqllike.append(" and rid like '%"+rid+"%'");
		}
		if( name!=null && !"".equals(name) ) {
			sqllike.append(" and name like '%"+name+"%'");
		}
		if( department!=null && !"0".equals(department) ) {
			sqllike.append(" and department="+Integer.valueOf(department));
		}
		
	}

	//分页查询中人数
	public int countReg() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from ("+sqllike.toString()+") t ";
		Number n = null;
		try {
			
			n = (Number)JdbcUtils.qr.query(sql, new ScalarHandler<Number>());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n.intValue();
	}
	
	//分页查询返回集合对象
	public List<Register> queryRegister(Page p) {
		// TODO Auto-generated method stub
		String sql = "select *from ("+sqllike+") t   limit "+p.getStartIndex()+","+p.getNumbers();
		List<Register> list = null;
		try {
			list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Register.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int delRegister(String rids) {
		// TODO Auto-generated method stub
		String sql = "delete  from register where rid in("+rids+")";

		try {
			int n =JdbcUtils.qr.execute(sql);
			System.out.println(n);
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public Register detailsReg(String rid) {
		// TODO Auto-generated method stub
		String sql = "select * from register where rid=?";
		try {
			return JdbcUtils.qr.query(sql, new BeanHandler<>(Register.class) ,rid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
