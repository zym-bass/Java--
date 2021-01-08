package com.yiming.controller;

import com.yiming.entity.Dept;
import com.yiming.service.DeptService;
import com.yiming.utils.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;



    @RequestMapping("/{page}")
    public String forwardpage(@PathVariable("page") String page , Model model ){
        return "pages/"+page;
    }

    @ResponseBody
    @RequestMapping("/getAllDepts")
    public LayuiTable<Dept> getAllDepts(int page , int limit){
        return deptService.getAllDepts(page,limit);
    }
}
