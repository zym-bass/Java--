package com.yiming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class IndexController {

    //用于页面的跳转
    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String page){
        return "pages/"+page;
    }
}
