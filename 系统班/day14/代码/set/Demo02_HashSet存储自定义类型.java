package com.ujiuye.set;

import java.util.HashSet;

public class Demo02_HashSet存储自定义类型 {

	public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("张三",20));
        set.add(new Person("李四",19));
        set.add(new Person("张三",20));
        set.add(new Person("王五",18));
        // [Person [name=王五, age=18], Person [name=李四, age=19], Person [name=张三, age=20]]
        System.out.println(set);
        
      /*  Person p = new Person("张三", 20);
        Person p1 = new Person("张三", 20);
        int first = p.hashCode();
        int second = p1.hashCode();
        System.out.println(first);
        System.out.println(second);*/
	}
}
