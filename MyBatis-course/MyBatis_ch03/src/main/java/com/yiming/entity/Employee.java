package com.yiming.entity;

public class Employee {
    private Integer id;
    private String name ;
    private String gender;
    private Department department;

    public Employee() {
        super();
    }

    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name, String gender, com.yiming.entity.Department department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public Employee(Integer id, String name, String gender, com.yiming.entity.Department department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
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

    public com.yiming.entity.Department getDepartment() {
        return department;
    }

    public void setDepartment(com.yiming.entity.Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Department=" + department +
                '}';
    }

}

