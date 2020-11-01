package com.yiming.java28;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = -3768331370994578116L;
    //private static final long serialVersionUID = 24242435233236L;
    private transient   int no ;
    private transient   int sno ;
    private String name ;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
