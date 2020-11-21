package com.yiming.dbutils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class Controller {
    private static QueryRunner qr ;
    static {
        new QueryRunner(new ComboPooledDataSource());
    }

    public static void dbutilsTest(String username , String password ){
        String sql = "select *from s where username=? and password=?";
        try {
            Student s = qr.query(sql, new BeanHandler<>(Student.class),username,password);
            if (s!=null){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
