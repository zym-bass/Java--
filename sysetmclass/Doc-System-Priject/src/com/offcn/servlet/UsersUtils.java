package com.offcn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.offcn.entity.Users;
import com.offcn.service.UsresService;
import com.offcn.utils.DateTimeUtils;


@WebServlet("*.do")
public class UsersUtils extends SuperUserServlet {
	private static UsresService us = new UsresService();
	
	//校验用户名
	public static void checkName(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String username  =null;
		Users users =null;
		if( (username= req.getParameter("username"))==null || "".equals(username)) {
			
		}else {
			System.out.println(username);
			if((users = us.checkName(username))==null) {
				resp.getWriter().print(true);
			}else {
				resp.getWriter().print(false);
			}
		}
		out.flush();
		out.close();
	}
	//校验邮箱
	public static void checkEmail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String email  =null;
		Users users =null;
		if( (email= req.getParameter("email"))==null || "".equals(email)) {
		
		}else {
			if((users = us.checkEmail(email))==null) {
				resp.getWriter().print(true);
			}else {
				resp.getWriter().print(false);
			}
		}
		out.flush();
		out.close();
	}
	//添加用户
	public static void addUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Object[] users ={req.getParameter("name"),req.getParameter("email"),req.getParameter("username"),req.getParameter("password"),DateTimeUtils.times()}; 
		
		int n = us.addUser(users);
		if(n!=0) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("regist.jsp");
		}
	}
	//用户登录
	public static void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		//获取正确的验证码
		String verCode = (String) session.getAttribute("verCode");
		//用户输入的验证码
		String verify =req.getParameter("verify");
		//获取用户名和密码
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//获取打印流
		PrintWriter out = resp.getWriter();
		
		//查询条数
		Users users = null;
		if(verCode.equalsIgnoreCase(verify)){
			users =  us.login(username,password);
			if(users==null) {
				req.setAttribute("msg", "用户名密码不正确");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}else {
				users.setPassword("******");
				session.setAttribute("users", users);
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}else {
			req.setAttribute("msg", "验证码不正确");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
		//没有用户名
	/*	if()*/
	}
	//用户退出
	public static void outuser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().removeAttribute("users");
		req.getRequestDispatcher("login.jsp").forward(req,resp);
	}
}