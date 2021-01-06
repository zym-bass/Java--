package com.yiming.controller;

import com.yiming.entity.Role;
import com.yiming.service.RoleService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String page){
        return "pages/"+page;
    }


    @RequestMapping("/addRole")
    @ResponseBody
    public OAResult addRole(Role role,@RequestParam("sourcesIds[]") int[] sourcesIds){
        return roleService.addRole(role,sourcesIds);
    }
}
