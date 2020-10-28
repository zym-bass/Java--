package com.yiming.java1026;

import java.util.Properties;

/*
    目前只需要掌握Properties属性类对象的相关方法即可
        Properties是一个Map集合，继承Hashtable,Properties的key和value都是String类型
        Properties被称为属性类对象
        Properties是线程安全
*/
public class PropertiesTset01 {
    public static void main(String[] args) {
        //创建一个properties对象
        Properties pro = new Properties();

        //需要掌握Properties的两个方法，一个存 一个取
        pro.setProperty("username","root");
        pro.setProperty("usernamew","root");

        String ur1 = pro.getProperty("ur1");

    }
}
