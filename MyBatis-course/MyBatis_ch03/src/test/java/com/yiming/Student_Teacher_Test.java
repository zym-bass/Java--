package com.yiming;

import com.yiming.entity.Student;
import com.yiming.entity.StudentTeacher;
import com.yiming.entity.Teacher;
import com.yiming.mapper.StudentMapper;
import com.yiming.mapper.StudentTeacherMapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Student_Teacher_Test {
    //根据学生id查询学生信息和对应的老师
    @Test
    public  void getStudentById(){
        try(SqlSession session = MyBatisUtils.getSqlSession()){
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            Student student = mapper.getStudentById(1);
            System.out.println(student);
        }
    }
    //根据学生id查询学生信息和对应的老师
    @Test
    public  void getStudentById2(){
        try(SqlSession session = MyBatisUtils.getSqlSession()){
            StudentTeacherMapper mapper = session.getMapper(StudentTeacherMapper.class);
            mapper.getStudentTeachersBySid(1).forEach((StudentTeacher student)->{
                System.out.println(student);
            });
        }
    }
}
