package com.yiming.java11;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;

/*
    反编译
*/
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        StringBuilder s = new StringBuilder();


        //得到类
        Class studentClass = Class.forName("java.lang.Thread");

        s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{");

        //将类中属性获取到
        Field[] fields = studentClass.getDeclaredFields();

        for(Field m :fields){
            s.append("\n\t");
            s.append(Modifier.toString(m.getModifiers()));
            s.append(" ");
            s.append(m.getType());
            s.append(" ");
            s.append(m.getName());

        }
        s.append("\n");
        s.append("}");
        System.out.println(s);




    }
}
