package com.yiming.controller;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Enumeration<String>  goodNames = session.getAttributeNames();
        PrintWriter out = null ;


        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();


        out.print("<table  border=\"2\" align=\"center\"><tr><td>商品名称</td> <td>商品数量</td><tr> ");
        while (goodNames.hasMoreElements()){
            String s = goodNames.nextElement();
            out.print("<tr>");
            out.print("<td>"+s+"</td>");
            out.print("<td>"+session.getAttribute(s)+"</td>");
            out.print("</tr>");
        }
        out.print("</table>");
    }
}
