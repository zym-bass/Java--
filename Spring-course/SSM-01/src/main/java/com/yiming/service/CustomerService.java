package com.yiming.service;

import com.yiming.entity.Customer;
import com.yiming.utils.OAResult;
import com.yiming.utils.PageView;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerService {
    PageView<Customer> getCustomers(Integer currentPage , Integer pageSize,Integer selectType , String  keyword , Integer orderby);
    OAResult addCustomers(Customer customer);

    OAResult deleteCustomer(int[] ids);

    Customer getCustomerById(Integer id);
}
