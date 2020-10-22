package com.ujiuye.duotai;

public class Doctor extends Person {
	@Override
	public void eat() {
		System.out.println("医生吃的很清淡,养生");
	}
	
	public void savePerson() {
		System.out.println("医生可以治病救人");
	}
}
