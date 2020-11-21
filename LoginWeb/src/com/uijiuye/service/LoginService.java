package com.uijiuye.service;

import com.uijiuye.dao.LoginDao;
import com.ujiuye.domain.User;

/**
 * @author 111
 *  登录的业务层
 */
public class LoginService {

	public User login(String username, String password) {
		
		LoginDao dao=new LoginDao();
		User user=dao.login(username,password);
		return user;
	}

}
