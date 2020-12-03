package com.offcn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.offcn.entity.Doctor;
import com.offcn.entity.Page;
import com.offcn.service.DoctorService;


@WebServlet("*.doc")
public class DoctorUtils extends SuperUserServlet {
	private static DoctorService ds = new DoctorService();
	
	//添加医生用户
	public static void addDoctor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object[] doctor = {req.getParameter("name"),req.getParameter("cardno"),req.getParameter("phone"),
				Integer.valueOf(req.getParameter("sex")),Integer.valueOf(req.getParameter("age")),
				req.getParameter("birthday"),req.getParameter("email"),Integer.valueOf(req.getParameter("department"))
				,Integer.valueOf(req.getParameter("education")),req.getParameter("remark"),}; 

		if(ds.addDoctor(doctor)) {
			req.getRequestDispatcher("../doctor/index.jsp").forward(req, resp);
		}else {
			resp.getWriter().print("添加失败");
		}
	}
	//模糊查询 mohu
	public static void likeQuery(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ds.fysql(req.getParameter("name"), req.getParameter("department"));
		req.getRequestDispatcher("queryDocByPage.doc").forward(req, resp);
	}
	
	//分页查询 
	public static void queryDocByPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//医生总记录数
		int row = ds.queryDocCount();
		//当前页
		String courrent = req.getParameter("courrent");
		
		//对页面对象赋值
		Page page = new Page(row,5,courrent);
		
		//通过页面对象实现分页查询并返回集合
		List<Doctor> list = ds.queryDocByPage(page);
		
		req.setAttribute("page",page);
		req.setAttribute("list",list);
		req.getRequestDispatcher("doctor/index.jsp").forward(req, resp);
	}
	//批量删除
	public static void delDoctor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ids = req.getParameter("ids");
		if(ds.delDoctor(ids)) {
			req.getRequestDispatcher("queryDocByPage.doc").forward(req, resp);
		}else {
			resp.getWriter().print("删除失败");
		}
	}
	//查询单个医生信息
	public static void detailsDoc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String did = req.getParameter("did");
		
		Doctor doc = ds.detailsDoc(Integer.valueOf(did));
		req.setAttribute("doc", doc);
		req.getRequestDispatcher("/doctor/look.jsp").forward(req, resp);
		
	}
	//前往修改页面
	public static void midifyDoc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String did = req.getParameter("did");
		
		Doctor doc = ds.detailsDoc(Integer.valueOf(did));
		req.setAttribute("doc", doc);
		
		req.getRequestDispatcher("/doctor/edit.jsp").forward(req, resp);
		
	}
	//修改医生个人信息
	public static void midifaDocid(HttpServletRequest req, HttpServletResponse resp){
		try {
		System.out.println("--------000-");
		Doctor doc = new Doctor(Integer.valueOf(req.getParameter("did")),req.getParameter("name"),
				req.getParameter("cardno"),req.getParameter("phone"),
				Integer.valueOf(req.getParameter("sex")),Integer.valueOf(req.getParameter("age")),req.getParameter("birthday"),
				req.getParameter("email"),
				Integer.valueOf(req.getParameter("department")),Integer.valueOf(req.getParameter("education")),
				req.getParameter("remark"));
		
		if(ds.updateDoc(doc)) {
			queryDocByPage(req,resp);
		}else {
			resp.getWriter().print("修改失败");
		}
		}catch (Exception e) {
			try {
				resp.getWriter().print("修改失败");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
		
	
}