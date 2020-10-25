package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    测试List接口中常用方法
        1. List集合存储元素特点：有序可重复
            有序：List集合中的元素有下标
            可重复：存储了一个1，之后还可以存储一个1
        2. List既然是Collection接口的子接口，那么肯定有其特有的方法
            1）.
            void        add(int index, E element)
            在列表的指定位置插入指定元素（可选操作）。
            2).
            E          get(int index)
            返回列表中指定位置的元素。
            3).
            int         indexOf(Object o)
            返回此列表中第一次出现的指定元素的索引；
            如果此列表不包含该元素，则返回 -1。
            4).
            int         lastIndexOf(Object o)
            返回此列表中最后出现的指定元素的索引；
            如果列表不包含此元素，则返回 -1。
            5).
             E          remove(int index)
            移除列表中指定位置的元素（可选操作）。
            6).
             E          set(int index, E element)
            用指定元素替换列表中指定位置的元素（可选操作）。


*/
public class ListTest01 {
    public static void main(String[] args){
        List myList = new ArrayList();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        //在一定下标添加元素
        myList.add(0,"Iterable");


        Iterator it =  myList.iterator();
        while(it.hasNext()){
            Object elt = it.next();
            System.out.println(elt);
        }

        System.out.println(myList.get(0));
        Object o = myList.get(0);
        System.out.println(o);
        System.out.println("\n");
        for(int i = 0;i < myList.size();i++){
            System.out.println(myList.get(i));
        }

        //获取指定对象第一次出现处的索引 myList.indexOf(Object o)
        System.out.println("C第一次出现的索引位置为："+myList.indexOf("C"));

        //修改指定下标的元素 myList.set(int index , Object o)
        myList.set(2,"葫芦娃");
        for(int i = 0;i < myList.size();i++){
            System.out.println(myList.get(i));
        }

    }
}
