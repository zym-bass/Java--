package com.yimig;

import com.yiming.dao.PersonDao;
import com.yiming.dao.impl.PersonDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void savePerson(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao personDao = (PersonDao) ctx.getBean("personDaoImpl");
        personDao.savePerson("123");
    }
}
