package com.yiming.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

class C3p0dbutils {
    static QueryRunner rq ;
    static {
        rq =new QueryRunner(new ComboPooledDataSource());
    }

}
