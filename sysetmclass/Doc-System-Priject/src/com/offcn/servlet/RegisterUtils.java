package com.offcn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.offcn.entity.Page;
import com.offcn.entity.Register;
import com.offcn.service.RegisterService;
import com.offcn.utils.DateTimeUtils;

@WebServlet("*.reg")
public class RegisterUtils  extends SuperUserServlet{
	
	private  static  RegisterService rs  = new RegisterService();
	//添加挂号信息
	public static void addRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Object[] register = {req.getParameter("rid"),req.getParameter("name"),req.getParameter("idCard"),req.getParameter("siNumber"),
				req.getParameter("registerMoney"),req.getParameter("phone"),req.getParameter("isPay"),req.getParameter("sex"),
				req.getParameter("age"),req.getParameter("consultation"),req.getParameter("department"),req.getParameter("did"),
				new DateTimeUtils().times(),req.getParameter("remark")};
		if(rs.addRegister(register)) {
			queryRegister(req,resp);
		}else {
			resp.getWriter().print("失败了");
		}
		resp.getWriter().flush();
		resp.getWriter().close();
	}
	
	//模糊拼接sql语句
	public static void likesql(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		rs.likesql(req.getParameter("rid"),req.getParameter("name"),req.getParameter("department"));
		queryRegister(req,resp);
	}
	//分页查询
	public static void queryRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//创建初始化页面对象
		Page p = new Page(rs.countReg() , 5 ,req.getParameter("courrentPage"));
		//创建集合对象，并得到数据
		List<Register> list =rs.queryRegister(p);
		req.setAttribute("list", list);
		req.setAttribute("page", p);
		req.getRequestDispatcher("register/index.jsp").forward(req, resp);
	}
	//批量删除挂号信息
	public static void delRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dids = req.getParameter("dids");
		if(rs.delRegister(dids)) {
			queryRegister(req,resp);
		}else {
			resp.getWriter().print("删除失败");
		}
	}
	//根据挂号病例号查询信息打印到look.jsp页面
	public static void detailsReg(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		regquery("rid","register/look.jsp",req , resp);
	}
	private static void regquery(String name , String src ,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rid = req.getParameter(name);
		Register reg = rs.detailsReg(rid);
		req.setAttribute("s", reg);
		req.getRequestDispatcher(src).forward(req, resp);
	}
	//根据挂号病例号查询信息打印到edit.jsp页面
	public static void midifyReg(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		regquery("rid","register/edit.jsp", req, resp);
	}
}
