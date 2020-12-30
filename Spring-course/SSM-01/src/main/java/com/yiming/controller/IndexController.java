package com.yiming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class IndexController {

    @RequestMapping("/index")
    public String forwardIndex() {
        return "main/index";
    }

    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String page) {
        return "main/" + page;
    }
}
