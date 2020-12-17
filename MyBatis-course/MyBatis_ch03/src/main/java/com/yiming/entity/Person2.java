package com.yiming.entity;

public class Person2 {
    private  int id ;
    private  String name ;
    private  Idcard idcard ;

    public Person2() {
        super();
    }

    public Person2(String name, Idcard idcard) {
        this.name = name;
        this.idcard = idcard;
    }

    public Person2(int id, String name, Idcard idcard) {
        this.id = id;
        this.name = name;
        this.idcard = idcard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Idcard getIdcard() {
        return idcard;
    }

    public void setIdcard(Idcard idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idcard=" + idcard +
                '}';
    }
}
