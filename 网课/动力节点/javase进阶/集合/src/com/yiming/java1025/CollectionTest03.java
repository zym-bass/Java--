package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {

    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        //获取迭代器
        Iterator s = c.iterator();

        while(s.hasNext()){
            Object o = s.next();
            if( o instanceof Integer ){
                Integer intergers = (Integer)o;
                System.out.println(intergers);
            }
        }
    }
}
