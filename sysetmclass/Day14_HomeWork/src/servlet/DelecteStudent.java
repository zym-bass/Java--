package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import service.Studentservice;

/*@WebServlet("/DelecteStudent")*/
public class DelecteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
	    String sno =req.getParameter("sno");
	    int id= Integer.valueOf(sno);
	   
	   
	   boolean falg = new  Studentservice().deleteStu(id);
	   if(falg) {
		   resp.sendRedirect("QueryStudent");
	   }
   }
}
