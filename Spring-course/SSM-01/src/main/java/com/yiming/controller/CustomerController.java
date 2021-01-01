package com.yiming.controller;

import com.yiming.entity.Customer;
import com.yiming.service.CustomerService;
import com.yiming.utils.OAResult;
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
    public PageView<Customer> getCustomers(@RequestParam(defaultValue = "1") Integer currentPage ,@RequestParam(defaultValue = "0") Integer selectType ,@RequestParam(defaultValue = "") String  keyword , @RequestParam(defaultValue = "0") Integer orderby){


        return customerService.getCustomers(currentPage,pageSize, selectType ,keyword ,orderby);
    }

    @ResponseBody
    @RequestMapping("/addCustomers")
    public OAResult addCustomers(Customer customer){
        return customerService.addCustomers(customer);
    }

    @ResponseBody
    @RequestMapping("/deleteCustomer")
    public OAResult deleteCustomer(@RequestParam("ids[]") int[] ids){
        System.out.println(ids);
        return customerService.deleteCustomer(ids);
    }

    @ResponseBody
    @RequestMapping("/getCustomerById")
    public Customer getCustomerById(Integer id){
        return customerService.getCustomerById(id);
    }
}
