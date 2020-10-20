package com.yiming.java1020.objecttest;

public class Student {
    //学号
    int no ;
    //所在学校
    String school;

    public Student(){}
    /*public Student(String school ){
        this.school = school ;
    }*/
    /*public Student(String school){
        this.school = school;
    }*/
    public Student(int no , String school){
        this.no = no ;
        this.school = school ;
    }
    //重写equals 方法
    //需求：当一个学生的学号相同，并且学校相同时，表示同一个学生
    //思考：这个equals()
    public boolean equals(Object o){
        if(this == o ){
            return true;
        }
        if(o == null || getClass() != o.getClass() ){
            return false;
        }
        Student s = (Student)o;
        return s.no == this.no && this.school.equals(s.school);
    }
}
