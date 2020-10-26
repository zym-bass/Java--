package com.ujiuye.homework10;

public class TestAnimal {

	public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Animal dog = new Dog();
        dog.setAge(2);
        dog.setColor("黑色");
        p.keepPet(dog, "啃骨头");
        
        Person p1 = new Person("老李",25);
        Animal cat = new Cat();
        cat.setAge(3);
        cat.setColor("灰");
        p1.keepPet(cat, "鱼");
	}

}
