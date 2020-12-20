package com.yiming.mapper;

import com.yiming.entity.StudentTeacherExample;
import com.yiming.entity.StudentTeacherKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentTeacherMapper {
    long countByExample(StudentTeacherExample example);

    int deleteByExample(StudentTeacherExample example);

    int deleteByPrimaryKey(StudentTeacherKey key);

    int insert(StudentTeacherKey record);

    int insertSelective(StudentTeacherKey record);

    List<StudentTeacherKey> selectByExample(StudentTeacherExample example);

    int updateByExampleSelective(@Param("record") StudentTeacherKey record, @Param("example") StudentTeacherExample example);

    int updateByExample(@Param("record") StudentTeacherKey record, @Param("example") StudentTeacherExample example);
}