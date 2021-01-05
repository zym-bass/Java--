package com.yiming.controller;

import com.yiming.entity.Sources;
import com.yiming.service.SourcesService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/resources")
public class ListResourceController {

    @Autowired
    private SourcesService sourcesService;


    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String  page , Model model ,Integer id){
        model.addAttribute("id",id);
        return "pages/"+page;
    }


    @ResponseBody
    @RequestMapping("getRootSources")
    public List<Sources> getRootSources(@RequestParam(defaultValue = "0") Integer pid){
        return sourcesService.getRootSources(pid);
    }

    @ResponseBody
    @RequestMapping("getParentNodes")
    public List<Sources> getParentNodes(){
        List<Sources> sources = new ArrayList<>();
        return sourcesService.getParentNodes(sources);
    }

    @ResponseBody
    @RequestMapping("addSources")
    public OAResult addSources(Sources sources){
        return sourcesService.addSources(sources);
    }

    @ResponseBody
    @RequestMapping("deleteSources")
    public OAResult deleteSources(Integer id){

        return sourcesService.deleteSources(id);
    }

    @ResponseBody
    @RequestMapping("getParentNodeById")
    public Sources getParentNodeById(Integer id){
        return sourcesService.getParentNodeById(id);
    }


    @ResponseBody
    @RequestMapping("updateSource")
    public OAResult updateSource(Sources sources ){

        return sourcesService.updateSource(sources);
    }
}
