package com.yiming.controller;

import com.yiming.entity.Employee;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.service.EmployeeService;
import com.yiming.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/querys")
    public String queryEmployees(Model model){
        List<Employee> employeeList = employeeService.getEmployees();
        model.addAttribute("employeeList",employeeList);
        return "pages/result";
    }


}
