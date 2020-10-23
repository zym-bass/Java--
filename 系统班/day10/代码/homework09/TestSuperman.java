package com.ujiuye.homework09;

public class TestSuperman {

	public static void main(String[] args) {
		Man m = new Superman();
		m.setName("ÖíÖíÏÀ");
		m.dealBusiness();
		
		Superman m1 = (Superman)m;
		m1.fly();
	}
}
