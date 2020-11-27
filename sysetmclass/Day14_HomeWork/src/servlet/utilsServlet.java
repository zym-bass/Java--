package servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import entity.PageClass;
import entity.Student;
import service.Studentservice;

@WebServlet("*.st")
@MultipartConfig
public class utilsServlet extends SuperServlet {
	static Studentservice ss = new Studentservice();
	// 添加学生信息
	public static void addStudent(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 中文乱码解决
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String sname = req.getParameter("sname");
		String sbir = req.getParameter("sbir");
		String[] hobbies = req.getParameterValues("hobby");
		String hobby = Arrays.toString(hobbies);
		String gender = req.getParameter("gender");
		hobby = hobby.substring(1, hobby.length() - 1);
		// 获取图片名
		Part part = req.getPart("photo");
		String header = part.getHeader("content-disposition");
		String fileName = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
		String uuid = UUID.randomUUID().toString();
		String photo = uuid + fileName;// 图片名称
		// 上传图片
		String path = "e:/img";
		part.write(path + File.separator + photo);
		// 添加学生信息
		Student s = new Student(sname, photo, hobby, sbir, gender);
		boolean flag = ss.addStu(s);
		if (flag) {
			// 添加成功
			resp.sendRedirect("queryStudent2.st");
		} else {
			// 添加失败
			resp.sendRedirect("error.html");
		}
	}

	// 查询学生信息
	public static void queryStudent(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		Studentservice ss = new Studentservice();
		List<Student> list = ss.queryStu();
		if (list != null) {
			System.out.println("hahahaha");
		} else {
			System.out.println("55555555555555555");
		}
		req.setAttribute("list", list);

		req.getRequestDispatcher("queryStudent.jsp").forward(req, resp);
	}

	// 删除学生信息
	public static void delecteStudent(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String sno = req.getParameter("sno");
		int id = Integer.valueOf(sno);

		boolean falg = new Studentservice().deleteStu(id);
		if (falg) {
			resp.sendRedirect("queryStudent2.st");
		}
	}

	// 选择删除
	public static void quanxuan(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String[] name = req.getParameterValues("anniu");
		for (String s : name) {
			System.out.println(s);
			System.out.println(Integer.valueOf(s));
			new Studentservice().deleteStu(Integer.valueOf(s));
		}
		resp.sendRedirect("queryStudent2.st");
	}
	// 修改元素

	/*// 分页
	public static void queryStudent2(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ServletContext application = req.getServletContext();
		boolean equals = "true".equals((String) req.getAttribute("return"));
		System.out.println(equals);
		if (application.getAttribute("n") == null || equals) {
			application.setAttribute("n", 1);

		}else {
			application.setAttribute("n", (Integer) application.getAttribute("n") + 1);
		}

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		int n = (Integer) application.getAttribute("n");
		Studentservice ss = new Studentservice();
		List<Student> list = null;
		if (((list = ss.query2Stu(n)).size()) == 0) {
			n--;
			list = ss.query2Stu(n);
		}
		application.setAttribute("n", n);
		System.out.println(n);
		req.setAttribute("list", list);
		req.getRequestDispatcher("queryStudent.jsp").forward(req, resp);
	}*/
	// 分页
		public static void queryStudent2(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取当前页
			String curPage = req.getParameter("curPage");
			System.out.println(curPage);
			//分页操作
			int rows=ss.queryStuCount();
			System.out.println("rows"+rows);
			PageClass pt = new PageClass(rows,5,curPage);
			System.out.println(pt);
			List<Student> list = ss.queryStuByPage(pt);
			req.setAttribute("list", list);
			req.setAttribute("pt", pt);
			req.getRequestDispatcher("queryStudent.jsp").forward(req, resp);
		}
		

	// 查询学生信息
	public static void modifiyStudentUI(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String sno = req.getParameter("sno");
		int id = Integer.valueOf(sno);

		Student s = new Studentservice().query3Stu(id);
		req.setAttribute("s", s);

		req.getRequestDispatcher("modifiyStudent.jsp").forward(req, resp);
	}

	public static void modifiyStudent1(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 中文乱码解决
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		Integer sno = Integer.valueOf(req.getParameter("sno"));
		String sname = req.getParameter("sname");
		String sbir = req.getParameter("sbir");
		String[] hobbies = req.getParameterValues("hobby");
		String hobby = Arrays.toString(hobbies);
		String gender = req.getParameter("gender");
		hobby = hobby.substring(1, hobby.length() - 1);
		// 获取图片名
		Part part = req.getPart("photo");
		String header = part.getHeader("content-disposition");
		String fileName = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
		String uuid = UUID.randomUUID().toString();
		String photo = uuid + fileName;// 图片名称
		// 上传图片
		String path = "e:/img";
		part.write(path + File.separator + photo);
		// 添加学生信息
		Studentservice ss = new Studentservice();
		Student s = new Student(sno,sname, photo, hobby, sbir, gender);
		boolean flag = ss.updateStu(s);
		if (flag) {
			// 添加成功
			resp.sendRedirect("queryStudent2.st");
		} else {
			// 添加失败
			resp.sendRedirect("error.html");
		}

	}
}
