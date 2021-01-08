package com.yiming.controller;

import com.yiming.entity.Employee;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;

    @RequestMapping("/{page}")
    public String forwardpage(@PathVariable("page") String page ){
        return "pages/"+page;
    }

    @RequestMapping("/getAllDepts")
    public List<Employee> getAllDepts(){
        return employeeService.getAllDepts();
    }

}
