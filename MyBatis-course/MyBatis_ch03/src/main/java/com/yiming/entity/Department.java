package com.yiming.entity;

import java.util.List;

public class Department {
    private Integer id;
    private String name ;
    private List<Employee> employees ;


    public Department() {
        super();
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Department(Integer id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
