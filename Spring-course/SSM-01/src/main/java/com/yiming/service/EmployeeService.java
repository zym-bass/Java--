package com.yiming.service;

import com.yiming.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployee(Integer id);

    List<Employee> getEmployees();
}
