package com.yiming.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

public class JdbcUtils {
    public static QueryRunner qr = null;
    static {
        qr = new QueryRunner(new ComboPooledDataSource());
    }
}
