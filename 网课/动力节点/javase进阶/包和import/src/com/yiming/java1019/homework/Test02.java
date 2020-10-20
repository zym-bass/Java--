package com.yiming.java1019.homework;

import com.yiming.java1020.访问控制权限.User;

public class Test02 {
    public static void main(String[] args) {
        User user = new User();

        //受保护的
        /*  System.out.println(user.age);//不可以*/

        //公开的
        System.out.println(user.weight);//不可以

        //默认的
        /*System.out.println(user.name);//不可以*/
    }
}
