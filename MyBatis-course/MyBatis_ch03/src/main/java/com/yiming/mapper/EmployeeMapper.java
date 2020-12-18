package com.yiming.mapper;

import com.yiming.entity.Employee;


import java.util.List;
import java.util.Map;

public interface EmployeeMapper{
    //根据id查询员工信息
    Employee getEmployeeById(Integer id);

    //根据部门id 查询所对应的所有的员工信息
    List<Employee> getEmployeesByDid(Integer id);

    //根据姓名和大于编号的查询信息
    List<Employee> getEmployeesByNameAge(Map<String , Object> map );

    //修改员工信息
    void updateEmployee(Employee employee);
}

