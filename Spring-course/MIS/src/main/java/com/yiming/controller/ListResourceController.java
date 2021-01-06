package com.yiming.controller;

import com.yiming.entity.Sources;
import com.yiming.service.Role_Source;
import com.yiming.service.SourcesService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/resources")
public class ListResourceController {

    @Autowired
    private SourcesService sourcesService;

    @Autowired
    private Role_Source role_source;

    //页面跳转，即方法调用
    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String  page , Model model ,Integer id){
        model.addAttribute("id",id);
        return "pages/"+page;
    }

    //获取树集合对象
    @ResponseBody
    @RequestMapping("getRootSources")
    public List<Sources> getRootSources(@RequestParam(defaultValue = "0") Integer pid){
        return sourcesService.getRootSources(pid);
    }

    //获取父类资源对象
    @ResponseBody
    @RequestMapping("getParentNodes")
    public List<Sources> getParentNodes(){
        List<Sources> sources = new ArrayList<>();
        return sourcesService.getParentNodes(sources);
    }

    //添加资源对象
    @ResponseBody
    @RequestMapping("addSources")
    public OAResult addSources(Sources sources){
        return sourcesService.addSources(sources);
    }

    //删除资源对象
    @ResponseBody
    @RequestMapping("deleteSources")
    public OAResult deleteSources(Integer id){
        role_source.isRole_SourceBySid(id);
        return sourcesService.deleteSources(id);
    }


    //通过id获取资源对象
    @ResponseBody
    @RequestMapping("getParentNodeById")
    public Sources getParentNodeById(Integer id){
        return sourcesService.getParentNodeById(id);
    }


    //修改资源对象
    @ResponseBody
    @RequestMapping("updateSource")
    public OAResult updateSource(Sources sources ){
        return sourcesService.updateSource(sources);
    }
}
