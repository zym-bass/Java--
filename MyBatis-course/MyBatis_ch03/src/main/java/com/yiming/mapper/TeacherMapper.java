package com.yiming.mapper;

import com.yiming.entity.Student;
import com.yiming.entity.Teacher;

import java.util.List;

public interface TeacherMapper {

    //根据Teacherid查询Teacher信息
    Teacher getTeacherById(Integer tid);

    //根据Studentsid查询Techer集合
    List<Teacher> getTeachersBySid(Integer sid);
}
