package com.yiming.controller;

import com.yiming.entity.Role;
import com.yiming.entity.RoleSources;
import com.yiming.service.RoleService;
import com.yiming.utils.LayuiTable;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


//角色管理功能页面
@Controller
@RequestMapping("/role")
public class RoleController {


    @Autowired
    RoleService roleService;

    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String page , Model model ,Integer roleid){
        model.addAttribute("roleid",roleid);
        return "pages/"+page;
    }

    //添加角色
    @RequestMapping("/addRole")
    @ResponseBody
    public OAResult addRole(Role role,@RequestParam("sourcesIds[]") int[] sourcesIds){
        return roleService.addRole(role,sourcesIds);
    }

    //
    @RequestMapping("/getAllRoles")
    @ResponseBody
    public LayuiTable<Role> getAllRoles(int page ,int limit){
        return roleService.getAllRoles(page,limit);
    }

    @RequestMapping("/deleteRole")
    @ResponseBody
    public OAResult deleteRole(Integer roleid){
        return roleService.deleteRole(roleid);
    }


    @RequestMapping("/getRoleById")
    @ResponseBody
    public Map<String,Object> getRoleById(Integer roleid){
        return roleService.getRoleById(roleid);
    }
    @RequestMapping("/updateRole")
    @ResponseBody
    public OAResult updateRole(Role role , @RequestParam("sourecesIds[]") Integer[] sourecesIds){
        return roleService.updateRole(role,sourecesIds);
    }

}
