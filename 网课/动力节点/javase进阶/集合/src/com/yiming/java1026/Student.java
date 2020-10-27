package com.yiming.java1026;

import java.util.Objects;

public class Student {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public Student(){}
    public Student(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(s, student.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
