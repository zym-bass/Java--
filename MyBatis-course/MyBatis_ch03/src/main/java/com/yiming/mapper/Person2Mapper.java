package com.yiming.mapper;

import com.yiming.entity.Person2;

import java.util.List;
import java.util.Map;

public interface Person2Mapper {
    //通过人的id查询信息及身份证信息
    Person2 getPerson2ById(Integer id);

    //根据姓名和年龄查询模糊查询信息
    List<Person2> getPerson2sByNameIdLike(Map<String , Object> map );
}
