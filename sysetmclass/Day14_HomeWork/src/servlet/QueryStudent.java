package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import service.Studentservice;


//@WebServlet("/QueryStudent")
public class QueryStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		Studentservice ss = new Studentservice();
		List<Student> list = ss.queryStu();
		if(list!=null) {
			System.out.println("hahahaha");
		}else {
			System.out.println("55555555555555555");
		}
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("queryStudent.jsp").forward(req, resp);
   }

}
