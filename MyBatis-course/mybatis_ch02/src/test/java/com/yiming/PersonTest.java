package com.yiming;

import com.mysql.jdbc.PreparedStatement;
import com.yiming.entity.Person;
import com.yiming.mapper.PersonMapper;
import com.yiming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonTest {

    //查询所有人信息
    @Test
    public void getAllPerson(){
        try(
             SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            List<Person> allPerson = personMapper.getAllPerson();
            allPerson.forEach((Person person) -> {
                System.out.println(person);
            });
        }

    }
    //添加信息
    @Test
    public void addPerson(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            Person person = new Person("张潜艇", "女", new Date(), 22);
            personMapper.addPerson(person);
            System.out.println(person);
            sqlSession.commit();
        }
    }

    //删除信息
    @Test
    public void deletePerson(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            personMapper.deletePerson(5);
            sqlSession.commit();
        }
    }

    //修改信息
    @Test
    public void updatePerson(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            personMapper.updatePerson(new Person(3,"李潜艇", "男", new Date(), 20));
            sqlSession.commit();
        }
    }

    //根据性别年龄查询信息
    @Test
    public void getPersonByGenderAndAge(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

            Map<String ,Object> map = new HashMap<>();
            map.put("gender","女");
            map.put("age",22);
            List<Person> allPerson = personMapper.getPersonByGenderAndAge(map);
            allPerson.forEach((Person person) -> {
                System.out.println(person);
            });
        }
    }

    //使用姓名进行模糊查询
    @Test
    public void getPersonByLikeName(){
        try(
                SqlSession sqlSession = MyBatisUtils.getSqlSession();
                ){
            PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
            List<Person> list = mapper.getPersonByLikeName("潜艇");
            list.forEach((Person person)->{
                System.out.println(person);
            });

        }
    }


}
