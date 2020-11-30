package com.yiming.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yiming.entity.Province;
import com.yiming.service.ShengHuiService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class TwoServlet extends HttpServlet {
    static ShengHuiService shs = new ShengHuiService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sno = null;
        //获取数据
        sno = request.getParameter("sno");
        Province  p = null;
        //获取
        p = shs.query(Integer.valueOf(sno));
       /* System.out.println(p);*/
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(p);

        if("null".equals(json)){
            System.out.println("--------------");
            json = "{\"id\":0,\"name\":\"\",\"jiancheng\":\"\",\"shenghui\":\"\"}";
        }

        //指定服务器端（servlet）返回给浏览器的是json格式的数据
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(json);

    }
}
