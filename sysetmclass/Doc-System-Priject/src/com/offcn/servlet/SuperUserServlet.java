package com.offcn.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SuperUserServlet
 */
@WebServlet("/SuperUserServlet")
public class SuperUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	String url = req.getRequestURI();
    	String method = url.substring(url.lastIndexOf("/")+1, url.lastIndexOf("."));
    	
    	Class<? extends SuperUserServlet> class1 = this.getClass();
    	
    	 try {
    		
    		
    		System.out.println(method);
			Method md = class1.getMethod(method, HttpServletRequest.class , HttpServletResponse.class);
			md.invoke(this,req, resp);
    	 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}

}
