package com.yiming.service;

import com.yiming.domain.Dept;

public interface DeptService {

    void addDept(Dept dept);
    Dept getDeptById(Integer deptno);
}
