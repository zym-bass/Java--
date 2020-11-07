package com.yiming.bean;

/*
    反射属性
*/

public class Student {
    public int no ;
    private String name;
    protected int age;
    boolean sex ;
    private final int IN = 213;
    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
