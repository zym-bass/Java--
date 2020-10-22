package com.ujiuye.duotaigood;

public class TestFarmer {
	
	public static void useI(int i) {// int i = 10;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int j = 10;
		useI(j);// 传递的实际参数就是j值所表示10
		
		Farmer f = new Farmer();
		Animal c = new Cat();
		/*
		 * public void wei(Animal a) {// Animal a = new Cat(); 多态
			 a.eat();
		}*/
		// 喂猫
		f.wei(c);// new Cat(); 猫吃鱼
		
		Dog d = new Dog();
		/*
		 * public void wei(Animal a) {// Animal a = new Dog(); 多态
			 a.eat();
		}*/
		f.wei(d);// 狗啃骨头
		f.wei(new Dog());
		
		/*
		 * public void wei(Animal a) {// Animal a = new Sheep(); 多态
			 a.eat();
		}*/
		Sheep sh = new Sheep();
		f.wei(sh);	//羊吃青草	
	}
}
