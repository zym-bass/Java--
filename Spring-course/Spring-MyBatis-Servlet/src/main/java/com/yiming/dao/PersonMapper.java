package com.yiming.dao;

import com.yiming.entity.Person;

import java.util.List;

public interface PersonMapper {
    void savePerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Integer id);
    Person getPersonById(Integer id);
    List<Person> getPersons();
}
