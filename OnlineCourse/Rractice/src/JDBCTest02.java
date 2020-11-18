import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) {
        //获取驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        Statement st = null;
        ResultSet re = null;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","3333");
            st = conn.createStatement();

            String sql = "select *from s ";
            re= st.executeQuery(sql);
            while (re.next()){
                System.out.println(re.getString("sno") + re.getString("SNAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}