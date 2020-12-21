package com.yiming.factory;

import com.yiming.dao.PersonDao;
import com.yiming.dao.impl.PersonDaoImpl;

public class BeanFactory {

    //工厂的静态方法
    public static PersonDao createPersonDao(){
        return  new PersonDaoImpl();
    }
    //工厂的非静态方法
    public PersonDao createPersonDao2(){
        return new PersonDaoImpl();
    }

}
