package utils;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	public static QueryRunner qr=null;
	static {
		qr = new QueryRunner(new ComboPooledDataSource());
	}
}
