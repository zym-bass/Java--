package com.yiming.dao.impl;

import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;

import java.util.List;

public class PersonDaoImpl implements PersonDao {


    @Override
    public void savePerson(Person person) {
        System.out.println("保存成功");
    }

    @Override
    public void updatePerson(Person person) {
        System.out.println("更新成功");
    }

    @Override
    public void deletePerson(Integer id) {
        System.out.println("删除成功");
    }

    @Override
    public Person getPersonById(Integer id) {
        System.out.println("查找成功");
        return null;
    }

    @Override
    public List<Person> getPersons() {
        System.out.println("查询集合成功");
        return null;
    }
}
