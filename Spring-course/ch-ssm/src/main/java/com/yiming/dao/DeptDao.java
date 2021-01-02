package com.yiming.dao;

import com.yiming.domain.Dept;

public interface DeptDao {

    Dept getDeptById(Integer deptno);
    void insertDept(Dept dept);
}
