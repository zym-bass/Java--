package com.ujiuye.map;

import java.util.HashMap;

public class Demo01_HashMap {

	public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("����",19), "�¼���");
        map.put(new Person("����",19), "���");
        map.put(new Person("����",20), "�й�");
        map.put(new Person("����",19), "����");
        //{Person [name=����, age=19]=���, Person [name=����, age=20]=�й�, Person [name=����, age=19]=����}
        System.out.println(map);
	}
}
