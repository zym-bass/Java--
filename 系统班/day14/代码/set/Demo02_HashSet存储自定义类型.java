package com.ujiuye.set;

import java.util.HashSet;

public class Demo02_HashSet�洢�Զ������� {

	public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("����",20));
        set.add(new Person("����",19));
        set.add(new Person("����",20));
        set.add(new Person("����",18));
        // [Person [name=����, age=18], Person [name=����, age=19], Person [name=����, age=20]]
        System.out.println(set);
        
      /*  Person p = new Person("����", 20);
        Person p1 = new Person("����", 20);
        int first = p.hashCode();
        int second = p1.hashCode();
        System.out.println(first);
        System.out.println(second);*/
	}
}
