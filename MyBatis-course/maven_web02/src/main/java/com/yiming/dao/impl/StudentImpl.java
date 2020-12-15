package com.yiming.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yiming.dao.StudentDao;
import com.yiming.entity.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class StudentImpl implements StudentDao {
    @Override
    public Student getStudent(String  id) {
        try {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql:///bjpowernode");
            dataSource.setUser("root");
            dataSource.setPassword("3333");
            QueryRunner qr = new QueryRunner(dataSource);
            return qr.query("select *from s  where username=?",new BeanHandler<>(Student.class),id);
        } catch (PropertyVetoException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
