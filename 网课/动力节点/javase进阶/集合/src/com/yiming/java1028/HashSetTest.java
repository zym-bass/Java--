package com.yiming.java1028;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Integer> set = new HashSet<>();

        //向集合添加元素
        set.add(1);
        set.add(3);set.add(7);
        set.add(4);
        set.add(2);set.add(2);set.add(2);
        set.add(5);
        set.add(99);

        for(Integer i : set){
            System.out.println(i);
        }

        //Iterator
        //获取迭代器
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            Integer a = it.next();
            System.out.println(a);
        }
    }
}
