package com.ujiuye.duotaigood;

public class TestFarmer {
	
	public static void useI(int i) {// int i = 10;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int j = 10;
		useI(j);// ���ݵ�ʵ�ʲ�������jֵ����ʾ10
		
		Farmer f = new Farmer();
		Animal c = new Cat();
		/*
		 * public void wei(Animal a) {// Animal a = new Cat(); ��̬
			 a.eat();
		}*/
		// ιè
		f.wei(c);// new Cat(); è����
		
		Dog d = new Dog();
		/*
		 * public void wei(Animal a) {// Animal a = new Dog(); ��̬
			 a.eat();
		}*/
		f.wei(d);// ���й�ͷ
		f.wei(new Dog());
		
		/*
		 * public void wei(Animal a) {// Animal a = new Sheep(); ��̬
			 a.eat();
		}*/
		Sheep sh = new Sheep();
		f.wei(sh);	//������	
	}
}
