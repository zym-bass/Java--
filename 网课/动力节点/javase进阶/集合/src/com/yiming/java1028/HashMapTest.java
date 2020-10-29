package com.yiming.java1028;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //创建HashMap集合
        Map<Integer,String> list =  new HashMap<>();
        //向集合添加元素
        list.put(1,"z");
        list.put(2,"y");
        list.put(3,"m");
        list.put(4,"x");



        //通过key删除键值对
        list.remove(1);
        System.out.println(list);


        list.put(1,"z");


        //replace()方法
        list.replace(1,"234");
        System.out.println(list);
    }
}
