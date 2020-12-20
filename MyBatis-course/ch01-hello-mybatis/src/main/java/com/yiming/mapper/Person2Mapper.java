package com.yiming.mapper;

import com.yiming.entity.Person2;
import com.yiming.entity.Person2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Person2Mapper {
    long countByExample(Person2Example example);

    int deleteByExample(Person2Example example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Person2 record);

    int insertSelective(Person2 record);

    List<Person2> selectByExample(Person2Example example);

    Person2 selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Person2 record, @Param("example") Person2Example example);

    int updateByExample(@Param("record") Person2 record, @Param("example") Person2Example example);

    int updateByPrimaryKeySelective(Person2 record);

    int updateByPrimaryKey(Person2 record);
}