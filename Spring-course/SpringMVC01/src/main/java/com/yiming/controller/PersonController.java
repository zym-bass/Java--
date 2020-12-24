package com.yiming.controller;


import com.yiming.entity.User;
import com.yiming.utils.DateConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/*将该类纳入到SpringMVC容器管理 key="personController"  即简单名称*/
@Controller
public class PersonController {

    /*
    * ModelAndView
    *
    * */
    /*当地址栏范围add时 调用该方法*/
    @RequestMapping("/add")
    public ModelAndView add(){
        System.out.println("add method");
        ModelAndView view = new ModelAndView();
        //逻辑视图名
        view.setViewName("success");//要跳转的页面
        view.addObject("message","添加成功");
        return view;
    }

    @RequestMapping("/addUser")
    public ModelAndView addUser(User user , Date birthday){
        System.out.println(birthday);
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        //逻辑视图名
        modelAndView.setViewName("success");
        modelAndView.addObject("message","添加成功");
        return modelAndView;
    }
}
