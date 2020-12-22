package com.yiming.service;

import com.yiming.entity.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Integer id);
    Person getPersonById(Integer id);
    List<Person> getPersons();
}
