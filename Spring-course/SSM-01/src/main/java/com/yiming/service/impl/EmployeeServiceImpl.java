package com.yiming.service.impl;

import com.yiming.entity.Employee;
import com.yiming.entity.EmployeeExample;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.service.EmployeeService;
import com.yiming.utils.OAResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Override
    public OAResult getEmployeeByUsernameAndPassword(String username, String password) {

        EmployeeExample employeeExample=new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        password= DigestUtils.md5DigestAsHex(password.getBytes());
        criteria.andPasswordEqualTo(password);
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if(employeeList!=null && employeeList.size()>0){
            return OAResult.build(200,"登陆成功",employeeList.get(0));
        }
        return OAResult.ok(400,"登陆失败");
    }

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployee(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeMapper.selectByExample(new EmployeeExample());
    }
}
