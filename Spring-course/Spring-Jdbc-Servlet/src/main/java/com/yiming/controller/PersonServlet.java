package com.yiming.controller;

import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;
import com.yiming.service.PersonService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/persons")
public class PersonServlet extends HttpServlet {
    //private PersonService personService;
    private PersonDao personService;
    @Override
    public void init() throws ServletException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        personService=(PersonDao) webApplicationContext.getBean("personDaoImpl");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person>personList = personService.getPersons();
        req.setAttribute("personList",personList);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
