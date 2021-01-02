package com.yiming.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.yiming.domain.Dept;
import com.yiming.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dept")
public class DeptServlet {


    @Autowired
    DeptService deptService;


    @RequestMapping("/getDeptById")
    public Dept getDeptById(@RequestParam("deptno") Integer deptno){
        System.out.println("deptno"+deptno);
        System.out.println("123");
        return deptService.getDeptById(deptno);
    }


    @RequestMapping("/addDept")
    public Dept addDept(Dept dept){
        System.out.println(dept);
        deptService.addDept(dept);
       /* Map<String,String> map = new HashMap<>();
        map.put("name",dept.getDeptno().toString());
        map.put("name",dept.getDname());
        map.put("name",dept.getDlocation());*/
        Dept dept1 = new Dept(20, "fwef" ,"wefw");
        return dept1;
    }
}
