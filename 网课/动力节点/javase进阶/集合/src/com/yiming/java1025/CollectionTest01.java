package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Collection;

/*
    1. Collection 中能存放什么元素？
           没有使用“泛型”之前，Collection什么元素都可以存放
           集合中不能直接存储基本数据类型，有不能存Java对象，只能
           存储Java对象的内存地址
    2. Collection常用方法
            boolean add(Object e)   //向集合添加元素
               int      size()      // 获取集合的个数
               void     clear()     //清空集合
               boolean  contains(Object o ); //查看该元素是否在这个集合中
               boolean  remove(Object o）;  //在集合中删除某个元素
               boolean  isEmpty(); //查看该集合是否没零
               Object   toArray(); //将集合转换成数组
 */
public class CollectionTest01 {
    public static void main(String[] args){
        //创建集合对象
        //Collection c = new Collection();//Collection是接口，抽象的，不能new对象
        //多态
        Collection c = new ArrayList();

        //测试Collection 接口中的常用方法


        c.add(1000);//自动装箱，实际上是放进区一个对象的内存地址。
        // Integer s = new Integer(1000);
        // c.add(s);

        c.add(32/2);
        c.add(true);

        //获取集合中元素的个数
        System.out.println("该集合的元素个数是："+c.size());

        //清空集合元素
        c.clear();
        System.out.println("该集合的元素个数是："+c.size());

        //再向集合中添加元素
        c.add("few");
        c.add(123);
        c.add(1244);
        c.add(2);
        //判断某个元素是否在该集合中 contains();
        System.out.println(c.contains(123));

        //向集合中删除某个元素 返回值boolean 有可能没有或者删除成功
        System.out.println(c.remove(4));

        //判断集合是否为空（集合中是否存在元素）
        System.out.println(c.isEmpty());//false
        //清空
        c.clear();
        System.out.println(c.isEmpty());//true

        c.add(224);
        c.add("fefw");
        c.add(4424);

        //转换成数组
        Object[] objs = c.toArray();


        //遍历数组
        for(Object s :objs){
            System.out.println(s);
        }
        //错误不能转换
        //String[]  d = (String[]) c.toArray();
        //Integer[] d1 = (Integer []) c.toArray();

    }
}
