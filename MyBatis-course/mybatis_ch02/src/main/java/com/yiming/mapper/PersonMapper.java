package com.yiming.mapper;

import com.yiming.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PersonMapper {
    List<Person> getAllPerson();

    void addPerson(Person person);

    void deletePerson(Integer id);

    void updatePerson(Person person);

    //List<Person> getPersonByGenderAndAge(@Param("gender") String gender , @Param("age") Integer age);
    List<Person> getPersonByGenderAndAge(Map<String, Object> map);

    List<Person> getPersonByLikeName(String name);

}
