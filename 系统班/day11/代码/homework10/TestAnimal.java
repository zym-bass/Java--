package com.ujiuye.homework10;

public class TestAnimal {

	public static void main(String[] args) {
        Person p = new Person("����", 30);
        Animal dog = new Dog();
        dog.setAge(2);
        dog.setColor("��ɫ");
        p.keepPet(dog, "�й�ͷ");
        
        Person p1 = new Person("����",25);
        Animal cat = new Cat();
        cat.setAge(3);
        cat.setColor("��");
        p1.keepPet(cat, "��");
	}

}
