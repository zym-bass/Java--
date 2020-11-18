import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            //获取驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","3333");
            st = conn.createStatement();

            String sql = "delete from s  where sno=10  ";
            int s = st.executeUpdate(sql);
            System.out.println(s);
            String sql1 = "delete from s   where sno=20  ";
            st.executeUpdate(sql1);
            System.out.println( st.executeUpdate(sql1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
