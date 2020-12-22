package com.yiming.entity;

import java.util.Date;

public class Person {
    private Integer id ;
    private String name ;
    private String gender;
    private Integer age;
    private Date birthday;

    public Person() {
        super();
    }

    public Person(String name, String gender, Integer age, Date birthday) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
    }

    public Person(Integer id, String name, String gender, Integer age, Date birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
