package com.yiming.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TwoServlet
 */
@WebServlet("/download02")
public class TwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fileName  = request.getParameter("file");
		
		System.out.println(fileName);
		
		response.setHeader("content-disposition", "attachment;filename="+fileName);
		
		
		ServletOutputStream out = response.getOutputStream();
		
		InputStream in = request.getServletContext().getResourceAsStream("img/"+fileName);
		
		byte[] is = new byte[1024];
		int len = 0 ;
		while((len=in.read(is))!=-1) {
			out.write(is,0,len);
		}
		out.close();
		in.close();
	}

	
}
