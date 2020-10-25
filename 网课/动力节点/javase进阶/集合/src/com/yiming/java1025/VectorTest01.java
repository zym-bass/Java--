package com.yiming.java1025;

import java.util.*;
/*
    Vector:
        1. 底层也是一个数组
        2. 初始化容量：10
        3. 怎么扩容的？
            扩容之后是原容量的2倍
            10->20->40->80
        4. ArrayList集合扩容的特点：
            ArrayList集合扩容的倍数是1.5
        5. Vector是线程安全的,Vetor中所有的方法都是线程同步的，都带有synchronized关键字，
        6. 如何将线程不安全的ArrayList集合转换成线程安全的呢？
            使用
*/

public class VectorTest01 {
    public static void main(String[] args){
        List l = new Vector();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println((Object) it.next());
        }
        List myList = new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(myList);
        myList.add("123");
        myList.add("123");
        myList.add("123");
        myList.add("123");
        myList.add("123");
        myList.add("123");
        myList.add("123");
        myList.add("123");

    }
}
