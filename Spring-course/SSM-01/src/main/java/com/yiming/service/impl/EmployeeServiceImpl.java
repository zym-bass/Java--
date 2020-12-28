package com.yiming.service.impl;

import com.yiming.entity.Employee;
import com.yiming.entity.EmployeeExample;
import com.yiming.mapper.EmployeeMapper;
import com.yiming.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

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
