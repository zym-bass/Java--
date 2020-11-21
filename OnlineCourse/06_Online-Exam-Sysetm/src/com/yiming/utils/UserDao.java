package com.yiming.utils;

import com.yiming.entity.Users;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class UserDao {

    //添加（注册）用户信息
    public int add(Users users ) throws SQLException {
        Object[] params = {users.getUserName(),users.getPassword(),users.getSex(),users.getEmail()};
        String sql = "insert into user (username ,password,sex , email) values(?,?,?,?)";
        return  C3p0dbutils.rq.update(sql,params);
    }
    //查询用户线信息
    public List<Users> find(){
        String sql = "select *from user";
        try {
            return C3p0dbutils.rq.query(sql,new BeanListHandler<>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null ;
    }
    //根据用户编号，删除用户信息
    public int delete (String userId){
        String sql = "delete from user where userId=?";
        try {
            return C3p0dbutils.rq.update(sql,Integer.valueOf(userId));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0 ;
    }

    //更加用户账号和密码,检验用户登录
    public Users login(String userName , String password){
        String sql = "select * from user where userName=? and password=?";
        try {
            return C3p0dbutils.rq.query(sql,new BeanHandler<>(Users.class),userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }
    /*@Test
    public void find02(){
        String sql = "select *from user";
        try {
            System.out.println(C3p0dbutils.rq.query(sql,new BeanListHandler<>(Users.class)));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void find01(){
        String sql = "select *from user where  userId=1 ";
        try {
            System.out.println(C3p0dbutils.rq.query(sql , new BeanHandler<>(Users.class)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
*/
}

