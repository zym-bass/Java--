package com.yiming;

import com.yiming.entity.Person2;
import com.yiming.mapper.Person2Mapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Person2_Idcard_Test {

    @Test
    //通过人的id查询信息及身份证信息
    public  void getPerson2ById(){
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession()
        ){
            Person2Mapper mapper = sqlSession.getMapper(Person2Mapper.class);
            Person2 person2ById = mapper.getPerson2ById(1);
            System.out.println(person2ById);
        }
    }

}
