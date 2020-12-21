package com.yiming.dao.impl;

import com.yiming.dao.PersonDao;

public class PersonDaoImpl implements PersonDao {


    @Override
    public void savePerson(String name) {

        System.out.println("保存"+name+"成功");
    }
}
