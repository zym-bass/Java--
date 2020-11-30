package com.yiming.dao;

import com.yiming.entity.Province;
import com.yiming.utils.C3P0Utils;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executors;

import static com.yiming.utils.JdbcUtils.qr;

public class ShengHuiDao {
    //根据编号查看省份名称
    public String queryName(Integer sno){
        String sql = "select name from province where id=?";
        String name = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = C3P0Utils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,sno);
            rs = ps.executeQuery();
            while(rs.next()){
                name =rs.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        C3P0Utils.closeAll(conn,ps,rs);
        if(name==null){
            name="";
        }
        return name;
    }

    //根据编号查询
    public Province query(Integer sno){
        String sql="select * from province where id=?";
        Province p = null;
        try {
            p = qr.query(sql, new BeanHandler<>(Province.class), sno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
}
