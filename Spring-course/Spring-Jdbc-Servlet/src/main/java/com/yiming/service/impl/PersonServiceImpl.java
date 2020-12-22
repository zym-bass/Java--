package com.yiming.service.impl;

import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;
import com.yiming.service.PersonService;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;

    public PersonServiceImpl() {
        super();
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void setPersonDao(PersonDao personDao) {
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
