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

    //使用缓存机制对根据学生id查询学生信息和对应的老师
    @Test
    public  void FirstCacheGetStudentById(){
        try(SqlSession session = MyBatisUtils.getSqlSession()){
            StudentMapper mapper = session.getMapper(StudentMapper.class);

            Student student1 = mapper.getStudentById(1);
            System.out.println("第一次查询："+student1.getName());
            //向map中放数据（"s_id=4",student1）;
            //更新 插入 删除
            student1.setName("刘龙");
            mapper.updateStudentBySid(student1);

            //第二次查询
            Student student2 = mapper.getStudentById(1);
            System.out.println("第二次查询："+student1.getName());
            session.commit();
        }
    }
}
