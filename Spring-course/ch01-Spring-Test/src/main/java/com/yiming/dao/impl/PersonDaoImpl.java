package com.yiming.dao.impl;

import com.yiming.dao.PersonDao;

public class PersonDaoImpl implements PersonDao {

    //初始化方法
    public void init(){
        System.out.println("init method");
    }

    //销毁方法
    public void destroy(){
        System.out.println("destroy method");
    }

    @Override
    public void savePerson(String name) {

        System.out.println("保存"+name+"成功");
    }
}
