package com.offcn.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import com.offcn.entity.Users;
import com.offcn.utils.JdbcUtils;

public class UsersDao {
	// 判断用户是否重复
	public static Users checkName(String username) {
		String sql = "select *from users  where username=?";

		Users users = null;
		try {
			users = JdbcUtils.qr.query(sql, new BeanHandler<>(Users.class), username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}

	// 判断邮箱是否重复
	public static Users checkEmail(String email) {
		String sql = "select *from users  where email=?";

		Users users = null;
		try {
			users = JdbcUtils.qr.query(sql, new BeanHandler<>(Users.class), email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}
	//添加管理者
	public static int addUser(Object[] users) {
		String sql = "insert into users(name, email , username , password , modifytime) values(? , ? ,? , ? ,?)";
		int n = 0 ;
		try {
			n = JdbcUtils.qr.update(sql,users);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	//登录管理
	public Users login(String username ,String password) {
		// TODO Auto-generated method stub
		String sql = "select *from users where username=? and password=?";
		Users users = null ;
		try {
			users = JdbcUtils.qr.query(sql , new BeanHandler<>(Users.class),username , password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}
