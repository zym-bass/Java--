/*
	JDBC编程六步
*/
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class JDBCTest01{
	public static void main(String[] args){
		//1,注册驱动
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());


		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//获取连接
			String url = "jdbc:mysql://ip地址/数据库名";
			String user="root";
			String password="zym06220905";
			Connection conn = DriverManager.getConnection(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}

		//2,获取连接
		//3,创建数据库对象
		//4,执行sql语句
		//5,处理查询结果集
		//6,释放资源
	}
}