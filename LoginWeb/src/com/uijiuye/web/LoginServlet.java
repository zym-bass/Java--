package com.uijiuye.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uijiuye.service.LoginService;
import com.ujiuye.domain.User;

/**
 * 登录的表现层
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户名
		String username = request.getParameter("username");
		// 获取密码
		String password = request.getParameter("password");

		System.out.println(username + " ----------- " + password);

		// 调用service

		LoginService service =new LoginService();
		User user=service.login(username,password);

		// 判断，做出响应
		if(user!=null){
			
			System.out.println(user.getUsername()+"，欢迎您");

			response.sendRedirect("success.html");
			/*//不要求
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(user.getUsername()+"，欢迎您");*/
			
		}else{
			System.out.println("您的用户名或者密码错误！");
			response.sendRedirect("error.html");
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
