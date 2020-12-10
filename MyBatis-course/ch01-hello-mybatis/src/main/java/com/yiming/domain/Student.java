package com.yiming.domain;

//类名与表名一样
public class Student {
    //定义属性，目前要求是属性名和列名一样
    private Integer sno;
    private String sname;
    private Integer classno;


    public Student() {
    }

    public Student(Integer sno, String sname, Integer classno) {
        this.sno = sno;
        this.sname = sname;
        this.classno = classno;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", classno=" + classno +
                '}';
    }
}
