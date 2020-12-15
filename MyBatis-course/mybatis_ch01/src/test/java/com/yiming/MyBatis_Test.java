package com.yiming;

import com.yiming.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;


public class MyBatis_Test {
    @Test
    //修改Person
    public void updatePerson(){
        try {
           SqlSession sqlSession =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapperConfig.xml")).openSession();
           sqlSession.update("com.yiming.entity.PersonMapper.updatePerson", new Person(1, "大一名", "男", new Date(), 20));
           sqlSession.commit();
           sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    //根据Id删除Person
    public  void deletePerson(){
        try {
            //1. 定义主配置文件，路径从主目标文件开始写（target/classes）
            String config = "sqlMapperConfig.xml";
            //2. 读取主配置文件
            InputStream in = Resources.getResourceAsStream(config);
            //3. 通过SqlSessionFactoryBuilder 获取SqlSessionFactory
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            //4. 通过SqlSessionFactory 获取到SqlSession
            SqlSession sqlSession = factory.openSession();
            //5. SqlSession方法执行sql语句
            System.out.println(sqlSession.delete("com.yiming.entity.PersonMapper.deletePerson", 1));
            //6. 通过SqlSession提交事务
            sqlSession.commit();
            //7. 关流
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //通过id查询Person
    @Test
    public void selectIdPerson(){
        try {
            //1. 定义sqlMapperConfig主配置文件.从类路径的根开始写，(target/classes)
            String config = "sqlMapperConfig.xml";
            //2. 读取该配置文件
            InputStream in = Resources.getResourceAsStream(config);
            //3.通过SqlSessionFactoryBuilder 获取 SqlSessionFactory
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

            //4. 通过SqlSessionFactory获取SqlSession
            SqlSession sqlSession = factory.openSession();

            //5. 确定指定的sql映射文件和指定sql语句 命名空间.id
            String id = "com.yiming.entity.PersonMapper.selectPerson";

            //6. 通过SqlSession指定语句完成查询
            Person  person = sqlSession.selectOne(id,1);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //插入Person数据
    @Test
    public void insertPerson() {
        try {
            //1. 定义mybatis主配置文件的名称,从类路径的根开始（target/classes）
            String config = "sqlMapperConfig.xml";

            //2. 读取这个config表示的文件
            InputStream in = Resources.getResourceAsStream(config);

            //3. 创建SqlSessionFactoryBuilder对象来获取SqlSessionFactory
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

            //4. 获取SqlSession对象，从SqlSessionFactory获取
            SqlSession sqlSession = factory.openSession();

            //5. 指定要执行的sql语句的标识
            //sql映射文件中的namespace.标签中的id值
            String id = "com.yiming.entity.PersonMapper.addPerson";


            //6. 调用insert 进行插入
            Person person = new Person("一名","男",new Date() ,12);
            sqlSession.insert(id,person);


            //7. 提交事务
            sqlSession.commit();


            //8. 关闭session
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
