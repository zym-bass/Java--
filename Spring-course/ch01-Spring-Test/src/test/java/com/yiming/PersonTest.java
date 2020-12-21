package com.yiming;

import com.yiming.dao.PersonDao;
import com.yiming.dao.impl.PersonDaoImpl;
import com.yiming.spring.SpringApplicationContext;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    //使用接口实例化对象
    @Test
    public void savePerson(){
        PersonDao personDao = new PersonDaoImpl();
        personDao.savePerson("lalala");
    }

    //使用spring容器实例化接口
    @Test
    public void savePerson2(){
        //创建spring容器对象
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
        *   1.利用Dom4j对applicationContext.xml进行解析，找到所有的bean标签
        *   2.找到bean标签中的id属性“personDao”,找到class属性‘com.yiming.impl’
        *   3.利用反射技术实例化该类的对象
        *      Class clazz = Class.forName("com.yiming.impl.PersonDaoImpl")
        *      Object obj = clazz.newInstance();
        *   4.以id属性值为key，以实例化出来的obj值，保存到spring容器中
        * */
        PersonDao personDao = (PersonDao)ctx.getBean("personDao");
        personDao.savePerson("啦啦啦");
    }
    //使用自定义容器
    @Test
    public void springApplicationContext(){
        SpringApplicationContext beans = new SpringApplicationContext("beans");
        PersonDaoImpl personDao =(PersonDaoImpl) beans.getBean("personDao");
        personDao.savePerson("2啦啦");
    }

    //使用spring容器实例化工厂接口
    @Test
    public void personDao2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao pd = (PersonDao)ctx.getBean("personDao3");
        pd.savePerson("lalal");
    }
}
