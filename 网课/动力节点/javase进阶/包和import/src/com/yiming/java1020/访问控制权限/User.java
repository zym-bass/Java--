package com.yiming.java1020.访问控制权限;

import java.lang.reflect.Array;

public class User {
    //给一些属性
    private int id ;

    //受保护的
    protected int age;

    //公开的
    public int weight ;

    String name ="2342";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
