package com.ujiuye.map;

import java.util.HashMap;

public class Demo01_HashMap {

	public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三",19), "新加坡");
        map.put(new Person("李四",19), "香港");
        map.put(new Person("王五",20), "中国");
        map.put(new Person("张三",19), "云南");
        //{Person [name=李四, age=19]=香港, Person [name=王五, age=20]=中国, Person [name=张三, age=19]=云南}
        System.out.println(map);
	}
}
