package com.yiming.dao.impl;

import com.yiming.dao.PersonDao;

public class PersonDaoImpl2 implements PersonDao {
    private int id;
    private String name;

    public PersonDaoImpl2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void savePerson(String name) {
        System.out.println(name+"开心"+"id---"+id);
        System.out.println("name---"+this.name);
    }
}
