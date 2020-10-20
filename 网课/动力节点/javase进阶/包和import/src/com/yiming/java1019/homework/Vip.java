package com.yiming.java1019.homework;

import com.yiming.java1020.访问控制权限.User;


public class Vip extends User {
    public void shopping(){
        System.out.println(this.age);
    }
   /* public static void main(String[] aegs){
        User user = new User();
        //错误的，protected在这里不行
        //可以，公开的，在哪都行。
        System.out.println(user.weight);
        //不可以
        System.out.println(user.age);
        //System.out.println(user.name);
    }*/
}
