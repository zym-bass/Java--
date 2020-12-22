package com.yiming.service.impl;


import com.yiming.dao.PersonMapper;
import com.yiming.entity.Person;
import com.yiming.service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonMapper personDao;

    public PersonServiceImpl() {
        super();
    }

    public PersonMapper getPersonDao() {
        return personDao;
    }

    public PersonServiceImpl(PersonMapper personDao) {
        this.personDao = personDao;
    }

    public void setPersonDao(PersonMapper personDao) {
        this.personDao = personDao;
    }

    @Override
    public void addPerson(Person person) {
        personDao.savePerson(person);
    }

    @Override
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public void deletePerson(Integer id) {
        personDao.deletePerson(id);
    }

    @Override
    public Person getPersonById(Integer id) {
        return personDao.getPersonById(id);
    }

    @Override
    public List<Person> getPersons() {
        return personDao.getPersons();
    }
}
