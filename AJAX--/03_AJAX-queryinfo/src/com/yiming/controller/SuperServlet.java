package com.yiming.controller;

import com.yiming.service.ShengHuiService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SuperServlet extends HttpServlet {
    static ShengHuiService shs = new ShengHuiService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sno = request.getParameter("sno");
        String name = "";
        if(!"".equals(sno) && sno!=null) {
            name = shs.queryshenghui(Integer.valueOf(sno));
        }
        response.setContentType("html/text;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print(name);
    }
}
