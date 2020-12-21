package com.yiming.dao.impl;


import com.yiming.entity.Book;

import java.util.*;

public class PersonDaoImpl3 {
    private int id;
    private String name ;
    private Date birthday;
    private List<Book> bookList;
    private Set<String> names;
    private Map<String ,String> person;
    private Properties pps;
    private int[] ages;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public Map<String, String> getPerson() {
        return person;
    }

    public void setPerson(Map<String, String> person) {
        this.person = person;
    }

    public Properties getPps() {
        return pps;
    }

    public void setPps(Properties pps) {
        this.pps = pps;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }
}
