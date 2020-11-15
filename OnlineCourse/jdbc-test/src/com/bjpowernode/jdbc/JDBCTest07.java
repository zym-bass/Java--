package com.bjpowernode.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *  测试类
 *     第一：测试DBUtil是否耗用
 *     第二：模糊查询怎么写？
 */
public class JDBCTest07 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs =null;

        try {
            //获取连接
            conn=DButil.getConnection();
            //conn.setAutoCommit(false);
            //获取编译的数据库对象
            String sql="select ename from emp where ename like ?  ";
            ps=conn.prepareStatement(sql);
            ps.setString(1,"_A%");
            rs=ps.executeQuery();
            //conn.commit();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            DButil.close(conn,ps,rs);
        }
    }
}
