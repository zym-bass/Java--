package com.yiming.java11;

public class ReflectTest09 {
    public static void main(String[] args) throws ClassNotFoundException {
        //String举例
        Class c = Class.forName("java.lang.String");

        //获取String的父类
        Class a =c.getSuperclass();
        System.out.println(a.toString());
        System.out.println(c.getSuperclass().getName());
        //获取String类实现的接口
        Class[] interfaceAll = c.getInterfaces();
        for (Class x: interfaceAll
             ) {
            System.out.println(x.getName());
        }
    }
}
