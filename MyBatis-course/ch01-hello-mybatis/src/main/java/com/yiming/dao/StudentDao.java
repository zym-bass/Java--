package com.yiming.dao;

import com.yiming.domain.Student;

import java.util.List;

//接口操作Student表
public interface StudentDao {
    //查询student表的所有数据
    public List<Student> selectStudent();

    //
}
