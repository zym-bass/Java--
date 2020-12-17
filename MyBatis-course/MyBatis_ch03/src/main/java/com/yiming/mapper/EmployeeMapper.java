package com.yiming.mapper;

import com.yiming.entity.Employee;

import java.util.List;

public interface EmployeeMapper{
    //根据id查询员工信息
    Employee getEmployeeById(Integer id);

    //根据部门id 查询所对应的所有的员工信息
    List<Employee> getEmployeesByDid(Integer id);
}
