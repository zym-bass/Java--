package com.yiming.mapper;

import com.yiming.entity.Department;

public interface DepartmentMapper {
    //根据id查询部门信息
    Department getDepartmentById(Integer id);

    //根据id查询部门内的员工
    Department getDepartmentByIds(Integer id);
}
