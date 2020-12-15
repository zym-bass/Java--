package com.yiming;

import com.yiming.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {


    public static void main(String[] args) throws IOException {
        //访问myBatis读取student数据
        //1. 定义mybatis主配置文件的名称，从类路径的根开始(target/classes)
        String config = "mybatis.xml";
        //2. 读取这个config表示的文件
        InputStream in =  Resources.getResourceAsStream(config);

        //3. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4. 创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);

        //5. 【重要】获取SqlSession对象，从SqlSessionFactory获取
        SqlSession sqlSession = factory.openSession();
        //6. 【重要】指定要执行的sql语句的标识。
        //sql映射文件中的namespace+"."+标签中的id值
        String id = "com/yiming/dao/StudentDao.selectStudent";

        //7. 执行sql语句，通过sql语句来找到语句
        List<Student> list =  sqlSession.selectList(id);

        //8. 输出结果 jdk8 新特性
        list.forEach(student -> System.out.println(student));

        //9. 关闭SqlSession对象
        sqlSession.close();
    }
}
