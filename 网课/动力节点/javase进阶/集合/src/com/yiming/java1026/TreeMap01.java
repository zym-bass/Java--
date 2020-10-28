package com.yiming.java1026;

import java.util.TreeSet;

/*
    1. TreeSet集合底层实际上是一个TreeMap
    2. TreeMap集合底层是一个二叉数
    3. 放到TreeSet集合中的元素，等同于放到TreeMap集合Key中
    4. TreeSet集合中的元素，无序不可重复，但是可以按照元素的大小顺序自动排序
    称为：可排序集合
    5. 自定义对象不能排序但要在自定义对象类中实现Conparable<Customer>
        并且实现compareTo方法。 equals可以不用写
*/
public class TreeMap01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangwu");
        for(String s : ts){
            System.out.println(s);
        }

        TreeSet<Person> p = new TreeSet<>();
        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(220);
        Person p4 = new Person(60);
        p.add(p3);
        p.add(p2);
        p.add(p1);
        p.add(p4);
        for(Person s : p){
            System.out.println(s);
        }
    }
}
class Person implements Comparable<Person>{
    int age;
    public Person(int age){
        this.age = age;
    }
    public int compareTo(Person p){
        return this.age-p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
