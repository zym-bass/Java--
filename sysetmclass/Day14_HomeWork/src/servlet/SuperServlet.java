package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SuperServlet
 */
@WebServlet("/SuperServlet")
@MultipartConfig
public class SuperServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		String url = req.getRequestURI();
		String method=null;
		req.setAttribute("return", req.getParameter("return"));
		if("?".contains(url)) {
			
		}else {
			method=url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
			System.out.println(method);		}
		Class<? extends SuperServlet> class1 = this.getClass();
		try {
			
			Method md = class1.getMethod(method, HttpServletRequest.class , HttpServletResponse.class);
			md.invoke(this,req, resp);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//invoke
	}
}
