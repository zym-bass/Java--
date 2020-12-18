package com.yiming.entity;

public class StudentTeacher {
    private  Integer sid;
    private  Integer tid;
    private Student student;
    private Teacher teacher;

    public StudentTeacher() {
        super();
    }

    public StudentTeacher(Integer sid, Integer tid, Student student, Teacher teacher) {
        this.sid = sid;
        this.tid = tid;
        this.student = student;
        this.teacher = teacher;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentTeacher{" +
                "sid=" + sid +
                ", tid=" + tid +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
