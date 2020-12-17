package com.yiming.mapper;

import com.yiming.entity.Person2;

public interface Person2Mapper {
    //通过人的id查询信息及身份证信息
    Person2 getPerson2ById(Integer id);
}
