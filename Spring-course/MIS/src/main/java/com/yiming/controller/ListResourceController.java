package com.yiming.controller;

import com.yiming.entity.Sources;
import com.yiming.service.SourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/resources")
public class ListResourceController {

    @Autowired
    private SourcesService sourcesService;


    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String  page){
        return "pages/"+page;
    }


    @ResponseBody
    @RequestMapping("getRootSources")
    public List<Sources> getRootSources(@RequestParam(defaultValue = "0") Integer pid){
        return sourcesService.getRootSources(pid);
    }

    @ResponseBody
    @RequestMapping("getSuperSources")
    public List<Sources> getParentNodes(){
        List<Sources> sources = new ArrayList<>();
        return sourcesService.getParentNodes(sources);
    }

}
