package com.ujiuye.extendsDemo;

public class TestAnimalExtends {

	public static void main(String[] args) {
         // 1. 创建出一个猫类对象
		Cat c = new Cat();
		c.eat(); // eat方法来自于从父类Animal中继承来的
		c.catchMouse();// catchMouse方法来自于Cat类型本身
		
		// 2. 创建出一个狗类对象
		Dog d = new Dog();
		d.eat();// eat方法来自于从父类Animal中继承来的
		d.lookHome();// lookHome方法来自于Dog类型本身
	}
}
