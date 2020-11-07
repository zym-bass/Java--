package com.yiming.java11;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取整个类

        Class student = Class.forName("com.yiming.bean.Student");

        //获取类中所有的Field
        Field[] fields =student.getFields();
        System.out.println(fields.length);
        System.out.println(fields[0]);
        Field field = fields[0];
        System.out.println(field.getName());

        //获取所有的Filed
        Field[] fs  = student.getDeclaredFields();
        for(Field s : fs){
            int i = s.getModifiers();
            System.out.println(Modifier.toString(i));


            Class fieldType = s.getType();
            String name = fieldType.getName();
            System.out.println(name);
            System.out.println(s.getType()+"-->"+s.getName());
            System.out.println("----------------");
        }
    }
}
