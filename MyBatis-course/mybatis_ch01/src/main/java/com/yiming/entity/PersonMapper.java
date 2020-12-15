package com.yiming.entity;

import java.util.List;

public interface PersonMapper {
    //查询所有
    List<Person> selectAll();
    //添加
    int addPerson(Person person);
}
