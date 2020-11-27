package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Studentservice;


@WebServlet("/quanxuan")
public class quanxuan extends HttpServlet {
	private static final long serialVersionUID = 1L;
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
	   String[] name = req.getParameterValues("anniu");
	   for(String s:name ) {
		   System.out.println(s);
		   System.out.println(Integer.valueOf(s));
		  new  Studentservice().deleteStu(Integer.valueOf(s));
	   }
	   resp.sendRedirect("QueryStudent");
   }
}
