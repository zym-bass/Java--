package com.offcn;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConn {

    private void  GetConn(){};
    static ComboPooledDataSource ds  = new ComboPooledDataSource();


    public static Connection getConnection() {

        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
