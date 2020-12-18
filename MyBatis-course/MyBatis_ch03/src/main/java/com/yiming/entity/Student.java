package com.yiming.entity;

import java.util.List;

public class Student {
    private Integer id ;
    private String name ;
    private List<StudentTeacher> studentTeachers;

    public Student() {
        super();
    }

    public Student(String name, List<StudentTeacher> studentTeachers) {
        this.name = name;
        this.studentTeachers = studentTeachers;
    }

    public Student(Integer id, String name, List<StudentTeacher> studentTeachers) {
        this.id = id;
        this.name = name;
        this.studentTeachers = studentTeachers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentTeacher> getStudentTeachers() {
        return studentTeachers;
    }

    public void setStudentTeachers(List<StudentTeacher> studentTeachers) {
        this.studentTeachers = studentTeachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentTeachers=" + studentTeachers +
                '}';
    }
}

