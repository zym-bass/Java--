package com.yiming.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiming.entity.Customer;
import com.yiming.entity.CustomerExample;
import com.yiming.mapper.CustomerMapper;
import com.yiming.service.CustomerService;
import com.yiming.utils.OAResult;
import com.yiming.utils.PageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper ;

    @Override
    public PageView<Customer> getCustomers(Integer currentPage, Integer pageSize  ,Integer selectType , String  keyword , Integer orderby) {


        /*1. 设置分页 */
        PageHelper.startPage(currentPage,pageSize);

        /*2. 查询 */
        CustomerExample customerExample = new CustomerExample();

        CustomerExample.Criteria criteria = customerExample.createCriteria();

        if (selectType == 1) {
            criteria.andComnameLike("%"+keyword+"%");
        } else if (selectType == 2) {
            criteria.andCompanypersonLike("%"+keyword+"%");
        }
        if (orderby == 1) {
            customerExample.setOrderByClause("addtime asc");
        } else if (orderby == 2) {
            customerExample.setOrderByClause("addtime desc");
        }

        List<Customer> customers = customerMapper.selectByExample(customerExample);


        /*3. 创建PageInfo对象 */
        PageInfo<Customer> pageInfo = new PageInfo<>(customers);
        PageView<Customer> pageView = new PageView<>(currentPage,pageSize);
        pageView.setRecords(pageInfo.getList());
        pageView.setTotalrecords(pageInfo.getTotal());

        return pageView;
    }

    @Override
    public OAResult addCustomers(Customer customer) {
        customer.setAddtime(new Date());
        if (customerMapper.insertSelective(customer)==1){
            return OAResult.ok(200,"添加成功");
        }
        return OAResult.ok(400,"添加失败");
    }

    @Override
    public OAResult deleteCustomer(int[] ids) {
        int x = 0;
        for (int i : ids) {
            if (customerMapper.deleteByPrimaryKey(i) == 1) {
                x++;
            }
        }
        if (x == ids.length) {
            return OAResult.ok(200, "删除成功");
        }
        return OAResult.ok(400, "删除失败");
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }


}
