package com.ujiuye.homework;

public class HomeWork2 {
	public static void main(String[] args) {
		Person p = new Person("老王",30);
		p.keepPet(new Dog(2,"黑色" ), "骨头");
		Person p1 = new Person("老李",25);
		p1.keepPet(new Cat(3,"灰色" ), "鱼");
	}
}
