package com.yiming.service;

import com.yiming.entity.Customer;
import com.yiming.utils.PageView;

import java.util.List;

public interface CustomerService {
    PageView<Customer> getCustomers(Integer currentPage , Integer pageSize);
}
