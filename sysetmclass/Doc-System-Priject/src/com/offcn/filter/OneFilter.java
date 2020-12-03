package com.offcn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OneFilter implements Filter{

	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		
		// TODO Auto-generated method stub
		
		HttpServletRequest req1 = (HttpServletRequest)req;
		HttpServletResponse resp1 = (HttpServletResponse)resp;
		
		String url = req1.getRequestURI();
		
		if(url.indexOf("regist")!=-1 || url.indexOf("authImage")!=-1 ) {
			
			fc.doFilter(req,resp);
			return;
		}
		
		//1. 通过拦截请求对象得到请求包参数信息
		HttpSession session =  req1.getSession(false);
		
		if(session==null || session.getAttribute("users")==null) {
			
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			return ;
		}
		//将拦截请求对象和响应对象交还给Tomcat,由Tomcat继续调用资源文件
		fc.doFilter(req,resp);
	
	
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
	
}
