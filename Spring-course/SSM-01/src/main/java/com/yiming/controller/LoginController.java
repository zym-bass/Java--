package com.yiming.controller;

import com.yiming.service.EmployeeService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = {"/","/login"})
    public String forwardPage(){
        return "login/login";
    }

    @ResponseBody
    @RequestMapping(value="/checkLogin",method = RequestMethod.POST)
    public OAResult checkLogin(String username, String password, HttpSession session){

        OAResult oaResult=employeeService.getEmployeeByUsernameAndPassword(username,password);
        if(oaResult.getStatus()==200){
            //把查询出来的Employee对象放到session域中
            session.setAttribute("activeUser",oaResult.getData());
        }
        return oaResult;
    }

}
