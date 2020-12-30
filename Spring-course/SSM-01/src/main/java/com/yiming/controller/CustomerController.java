package com.yiming.controller;

import com.yiming.entity.Customer;
import com.yiming.service.CustomerService;
import com.yiming.utils.PageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/cus")
public class CustomerController {

    @Value("${pageSize}")
    private int pageSize;

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/{page}")
    public String forwardPage(@PathVariable("page") String page){
        return "customer/"+page;
    }

    @ResponseBody
    @RequestMapping("/getCustomers")
    public PageView<Customer> getCustomers(@RequestParam(defaultValue = "1") Integer currentPage){


        return customerService.getCustomers(currentPage,pageSize);
    }
}
