/*
	JDBC�������
*/
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class JDBCTest01{
	public static void main(String[] args){
		//1,ע������
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());


		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//��ȡ����
			String url = "jdbc:mysql://ip��ַ/���ݿ���";
			String user="root";
			String password="zym06220905";
			Connection conn = DriverManager.getConnection(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}

		//2,��ȡ����
		//3,�������ݿ����
		//4,ִ��sql���
		//5,�����ѯ�����
		//6,�ͷ���Դ
	}
}