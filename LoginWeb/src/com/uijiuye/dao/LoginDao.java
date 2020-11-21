package com.uijiuye.dao;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.ujiuye.domain.User;
import com.ujiuye.utils.C3P0Utils;

import java.sql.SQLException;

/**
 * @author 111 登录的持久层
 */
public class LoginDao {

	public User login(String username, String password) {
		User user = null;
		try {
			// 创建操作对象
			QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
			// 编写sql
			String sql = "select * from s where username=? and password=?";
			// 执行操作
			Object[] params = { username, password };
			user = qr.query(sql, params, new BeanHandler<>(User.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
