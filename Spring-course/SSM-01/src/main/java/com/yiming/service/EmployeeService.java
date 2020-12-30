package com.yiming.service;

import com.yiming.entity.Employee;
import com.yiming.utils.OAResult;

import java.util.List;

public interface EmployeeService {

    Employee getEmployee(Integer id);

    List<Employee> getEmployees();
    OAResult getEmployeeByUsernameAndPassword(String username, String password);
}
