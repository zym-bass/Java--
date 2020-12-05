package com.offcn.servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.io.FileUtils;
import com.offcn.dao.Picture;
import com.offcn.entity.Doctor;
import com.offcn.entity.Medicine;
import com.offcn.entity.Page;
import com.offcn.service.MedicineService;
import com.offcn.utils.JdbcUtils;
import com.offcn.utils.MyFileUtils;

@WebServlet("*.med")
@MultipartConfig
public class MedicineUtils extends SuperUserServlet {
	
	private static MedicineService ms = new MedicineService();
	//添加药品功能
	public static void  addMed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取图片名
		Part part = req.getPart("picture");
		String header = part.getHeader("content-disposition");
		String fileName = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
		String uuid = UUID.randomUUID().toString();
		String picture = uuid + fileName;// 图片名称
		// 上传图片
		String path = "e:/img";
		
		
		
		
		Object[] medicines = {req.getParameter("mid"),picture,req.getParameter("inPrice"),
							req.getParameter("salPrice"),req.getParameter("name"),
							Integer.valueOf(req.getParameter("type")),req.getParameter("descs"),
							Integer.valueOf(req.getParameter("qualityDate")),req.getParameter("description"),
							req.getParameter("produceFirm"),req.getParameter("readme"),
							req.getParameter("remark")};
		
		if(ms.addMed(medicines)) {
			part.write(path + File.separator + picture);
			queryMedByPage(req,resp);
		}else {
			resp.getWriter().print("失败");
		}
		
	}
	//模糊查询
	public static void likeMed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ms.fysql(req.getParameter("name"), req.getParameter("type"));
		queryMedByPage(req,resp);
	}
	//分页
	//分页查询 
	public static void queryMedByPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=req.getScheme()+"://"+req.getServerName()+":"+
				req.getServerPort()+req.getContextPath()+"/";
		//药品总记录数
		int row = ms.queryMedCount();
		//当前页
		String courrent = req.getParameter("courrent");
		
		//对页面对象赋值
		Page page = new Page(row,5,courrent);
		//通过页面对象实现分页查询并返回集合
		List<Medicine> list = ms.queryMedByPage(page);
		
		req.setAttribute("page",page);
		req.setAttribute("list",list);
		req.getRequestDispatcher("medicine/index.jsp").forward(req, resp);
	}
	//批量删除
	public static void delMedicine(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Picture> list = ms.delFile(req.getParameter("mids"));
		System.out.println("=="+list+"==");
		if(ms.delMedicine(req.getParameter("mids"))) {
			
			System.out.println("=="+list+"==");
			for(Picture files : list) {
				MyFileUtils.deleteFile("e:/img/"+files.getPicture());
				
			}
			queryMedByPage(req,resp);
		}else {
			resp.getWriter().print("删除失败");
		}
		
	}
	//跳转查询页面
	public static void detailsMed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		details("mid","/medicine/look.jsp",req,resp);
		
	}
	
	//跳转修改页面
	public static void OnlyqueryMed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		details("mid","/medicine/edit.jsp", req, resp);
	}
	//修改信息
	public static void modifyMed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取文件名
		// 获取图片名
		Part part = req.getPart("picture");
		String header = part.getHeader("content-disposition");
		String fileName = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
		boolean judge ;
		String picture =null;
		System.out.println(req.getParameter("oldpicture"));
		System.out.println("===="+fileName+"====");
		System.out.println("===="+"".equals(fileName)+"====");
		if(!("".equals(fileName))) {
			judge=false;
			String uuid = UUID.randomUUID().toString();
			picture = uuid + fileName;// 图片名称
		// 上传图片
		}else {
			judge=true;
			picture=req.getParameter("oldpicture");
		}
		System.out.println("judge----------"+judge);
		System.out.println("picture-------"+picture);
		String path = "e:/img";
		
		
		
		Medicine med = new Medicine(req.getParameter("mid"),picture,req.getParameter("inPrice"),
		req.getParameter("salPrice"),req.getParameter("name"),
		Integer.valueOf(req.getParameter("type")),req.getParameter("descs"),
		Integer.valueOf(req.getParameter("qualityDate")),req.getParameter("description"),
		req.getParameter("produceFirm"),req.getParameter("readme"),
		req.getParameter("remark"));
		if(ms.modifyMed(med)) {
			if(!judge) {
				MyFileUtils.deleteFile("e:/img/"+req.getParameter("oldpicture"));
				part.write(path + File.separator + picture);
			}
			queryMedByPage(req,resp);
			
		}else {
			resp.getWriter().print("失败");
		}
	}	
	
	
	//查询药品单个信息
	private static void details(String parametere ,String src ,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mid = req.getParameter(parametere);
		
		Medicine med = ms.detailsMed(mid);
		req.setAttribute("med", med);
		req.getRequestDispatcher(src).forward(req, resp);
	}
}
