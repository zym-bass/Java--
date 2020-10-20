package com.yiming.java1020.访问控制权限;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.id);
        System.out.println(user.age);
        System.out.println(user.weight);
        System.out.println(user.name);
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
