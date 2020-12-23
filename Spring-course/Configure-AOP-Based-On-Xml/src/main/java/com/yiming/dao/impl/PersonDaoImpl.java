package com.yiming.dao.impl;


import com.yiming.dao.PersonDao;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Override
    public void savePerson(String name) {
        System.out.println("保存"+name+"成功");
    }

    @Override
    public void updatePerson(String name, int id) {
        System.out.println("id为："+id+"name为："+name+"修改成功");
    }

    @Override
    public void detelePerson(Integer id) {
        System.out.println("id为" + id+"删除成功");
    }

    @Override
    public String getNameById(Integer id) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu"+"zhaoliu");
        return names.get(id-1);
    }

    @Override
    public List<String> getName() {
        return Arrays.asList("zhangsan","lisi","wangwu"+"zhaoliu");

    }
}
