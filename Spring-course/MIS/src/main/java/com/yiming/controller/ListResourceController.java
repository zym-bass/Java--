package com.yiming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resources")
public class ListResourceController {

    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String  page){
        return "pages/"+page;
    }

}
