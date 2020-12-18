package com.yiming.mapper;

import com.yiming.entity.Student;

import java.util.List;

public interface StudentMapper {
    //根据学生id查询学生信息
    Student getStudentById(Integer sid);
    //根据老师id查询所对应的学生们
    List<Student> getStudentsByTid(Integer tid);
}
