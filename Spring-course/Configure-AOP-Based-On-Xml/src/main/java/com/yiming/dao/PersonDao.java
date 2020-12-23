package com.yiming.dao;

import java.util.List;

public interface PersonDao {
    void savePerson(String name);
    void updatePerson(String name ,int id);
    void detelePerson(Integer id);
    String getNameById(Integer id);
    List<String> getName();
}
