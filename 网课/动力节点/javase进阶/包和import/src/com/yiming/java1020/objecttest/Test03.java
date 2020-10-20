package com.yiming.java1020.objecttest;

public class Test03 {
    public static void main(String[] args){
        Student s1 = new Student(1,"w");
        Student s2 = new Student(1,new String("w"));
        System.out.println(s1.equals(s2));
    }
}
