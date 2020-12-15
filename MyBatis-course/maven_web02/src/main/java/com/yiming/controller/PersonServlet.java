package com.yiming.controller;

import com.alibaba.fastjson.JSON;
import com.yiming.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("11231");
        response.setContentType("text/html;charset=utf-8");
        SqlSession  sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("sqlMapperConfig.xml")).openSession();
        Person person = sqlSession.selectOne("com.yiming.entity.PersonMapper.selectPerson",Integer.parseInt(request.getParameter("id")));
        sqlSession.close();
        response.getWriter().print(JSON.toJSONString(person));

    }
}
