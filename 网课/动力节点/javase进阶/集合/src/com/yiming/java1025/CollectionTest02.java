package com.yiming.java1025;
/*
    关于集合中遍历/迭代专题
*/

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        //遍历方法/迭代方法，所有Collection通用的一种方式
        //在Map集合中不能用，在所有的Collection以及子类中使用
        //创建集合对象
        Collection c = new HashSet();

        //添加元素
        c.add("123");
        c.add(242);
        c.add(234);
        c.add("55dfd3");
        c.add(53);
        c.add("123");
        c.add(new Object());
        System.out.println("该集合的长度为："+c.size());
        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //迭代器的三个方法
        //boolean   hasNext() //如果仍有元素可以迭代，则返回true
        //Object          next()    //返回迭代的下一个元素
        //void      remove()  //从迭代器指向的collection中移除迭代器返回的最后一个元素（可选操作）
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合
        while(it.hasNext()){
            Object o = it.next();
            //采用集合删除，迭代器不更新出现异常，
            //c.remove(o);
            //采用迭代器删除，不仅将迭代器更新，还更新了集合
            it.remove();
            System.out.println(o);
            //System.out.println(it.next());

        }
        System.out.println("该集合的长度为："+c.size());
        /*boolean hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            //不管存进去的是什么，取出来都是Ojbect
            Object obj = it.next();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            //不管存进去的是什么，取出来都是Ojbect
            Object obj = it.next();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            //不管存进去的是什么，取出来都是Ojbect
            Object obj = it.next();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            //不管存进去的是什么，取出来都是Ojbect
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println(hasNext);*/
    }
}
