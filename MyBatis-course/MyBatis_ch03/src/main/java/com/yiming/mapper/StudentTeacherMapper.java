package com.yiming.mapper;

import com.yiming.entity.StudentTeacher;

import java.util.List;

public interface StudentTeacherMapper {

    //根据sid查询对应老师
    List<StudentTeacher> getStudentTeachersBySid(Integer sid);
}
