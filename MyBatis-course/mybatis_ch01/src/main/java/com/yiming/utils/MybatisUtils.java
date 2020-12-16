package com.yiming.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtils {
    private final SqlSessionFactory factory ;

    private  MybatisUtils(SqlSessionFactory factory){
        this.factory=factory;
    }

    private static MybatisUtils  mybatisUtils;

    static {
        try {
            mybatisUtils = new MybatisUtils(new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapperConfig.xml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SqlSession creatSqlSession(){
        return mybatisUtils.factory.openSession();
    }
}
