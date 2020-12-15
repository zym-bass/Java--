package com.yiming.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtils {
    public static SqlSession sqlSession=null;

    static {
        try {
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapperConfig.xml")).openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
