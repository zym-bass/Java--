package com.yiming.java1026;

import java.util.HashSet;
import java.util.Set;

/*
    java.util.Map接口中常用的方法：
        1. Map和Collection没有继承关系
        2. Map集合以key和value的方法存储数据：键值对
            key和value都是引用数据类型
            key和value都是存储对象的内存地址
            key起主导地位，value是个附属品
        3. Map接口中常用方法：

            V put(K key, V value)   向Map集合中添加键值对
            将指定的值与此映射中的指定键关联（可选操作）。

            V get(Object key)       通过Key获取value
            返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。

            void clear() 清空Map集合

            boolean containskey(Object key) 判断Map中是否包含某个key

            boolean containsValue(Object value) 判断Map中是否包含某个value

            boolean isEmpty()       判断Map集合中元素个数是否为0
            如果此映射未包含键-值映射关系，则返回 true。

            Set<K> keySet()     获取Map集合所有的key(所有的键是一个set集合)
            返回此映射中包含的键的 Set 视图。

            V remove(Object key)    通过key删除键值对
            如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。

            size()  获取集合中键值对的个数
            返回此映射中的键-值映射关系数。

            Collection<V> values()  获取Map集合中所有的value，返回一个Collection
            返回此映射中包含的值的 Collection 视图。

            Set<Map.Entry<K,V>> entrySet()  将Map集合转换成Set集合
            返回此映射中包含的映射关系的 Set 视图。

            Map 集合通过entrySet()转换成Set集合，Set集合中元素的类型是Map.Entry<K,V>  (Map.Entry静态内部类:是Map中的静态内部类)

*/
public class MapTest01 {
    public static void main(String[] args) {
        MyClass.InnerClass.m1();
        new MyClass.InnerClass().m2();

        //给一个set集合，该集合存储的对象是类型是：MyClass.InnerClass
        Set<MyClass.InnerClass> set = new HashSet<>();

        //````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
        Set<MyClass.InnerClass<String ,Integer>> set3 = new HashSet<>();
    }
}
class MyClass{
     static class InnerClass<K,V>{
        public static void m1(){
            System.out.println("静态内部类执行了");
        }
        public void m2(){
            System.out.println("实例方法执行啦");
        }
    }
}