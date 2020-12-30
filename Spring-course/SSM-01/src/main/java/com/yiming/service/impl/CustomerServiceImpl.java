package com.yiming.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiming.entity.Customer;
import com.yiming.entity.CustomerExample;
import com.yiming.mapper.CustomerMapper;
import com.yiming.service.CustomerService;
import com.yiming.utils.PageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper ;

    @Override
    public PageView<Customer> getCustomers(Integer currentPage, Integer pageSize) {

        /*1. 设置分页 */
        PageHelper.startPage(currentPage,pageSize);

        /*2. 查询 */
        CustomerExample customerExample = new CustomerExample();
        List<Customer> customers = customerMapper.selectByExample(customerExample);

        /*3. 创建PageInfo对象 */
        PageInfo<Customer> pageInfo = new PageInfo<>(customers);
        PageView<Customer> pageView = new PageView<>(currentPage,pageSize);
        pageView.setRecords(pageInfo.getList());
        pageView.setTotalrecords(pageInfo.getTotal());

        return pageView;
    }
}
