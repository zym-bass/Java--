package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Collection;

/*
    深入Collection集合的contains方法:
        boolean contains(Object o)
            判断集合中是否包含某个元素
            如果包含返回true ,如果不包含返回false。
        contains方法是用来判断集合中是否包含某个元素的方法
        那么它在底层是怎么判断集合中是否包含某个元素的呢 ？
            调用了equals方法进行比较
            equals方法返回true,就表示包含这个元素。
            调用equals方法看要查找的对象所对应的类是否重写equals()方法

*/
public class CollectionTest04 {
    public static void main(String[] args ){
        //创建集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add("a");
        String s1 = new String("abc");
        c.add(s1);
        c.add("ew");
        c.add("ewdqd");
        c.add("eqwdw");

        //集合中元素的个数
        System.out.println(c.size());

        String s2 = new String("abc");
        //使用contains判断某个元素是否包含在元素中
        System.out.println(c.contains(s2));//true
    }
}
