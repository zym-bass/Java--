package com.offcn.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.offcn.dao.UsersDao;
import com.offcn.entity.Users;

public class UsresService {
	static UsersDao ud = new UsersDao();
	//判断用户是否重复
	public  Users checkName(String username) {
		return  ud.checkName(username) ;
	}
	//判断是否重复
	public  Users checkEmail(String email) {
		return  ud.checkEmail(email) ;
	}
	//添加用户
	public int  addUser (Object[] users) {
		return ud.addUser(users);
	}
	//登录用户
	public Users login(String username, String password) {
		// TODO Auto-generated method stub
		return ud.login(username,password);
	}
}
