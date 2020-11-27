package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import entity.Student;
import service.Studentservice;
@MultipartConfig
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//中文乱码解决
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String sname = req.getParameter("sname");
		String sbir = req.getParameter("sbir");
		String[] hobbies = req.getParameterValues("hobby");
		String hobby = Arrays.toString(hobbies);
		
		hobby = hobby.substring(1, hobby.length()-1);
		//获取图片名
		Part part = req.getPart("photo");
		String header = part.getHeader("content-disposition");
		String fileName = header.substring(header.lastIndexOf("=")+2, header.length()-1);
		String uuid = UUID.randomUUID().toString();
		String photo = uuid+fileName;//图片名称
		//上传图片
		String path = "e:/img";
		part.write(path+File.separator+photo);
		//添加学生信息
		Studentservice ss = new Studentservice();
		Student s= new Student(sname,photo,hobby,sbir);
		boolean flag = ss.addStu(s);
		if(flag) {
			//添加成功
			resp.sendRedirect("QueryStudent");
		}else {
			//添加失败
			resp.sendRedirect("error.html");
		}
	}
	
}
