package com.ujiuye.homework08;

public class Phone {
	// Ʒ��brand,�۸�price
	private String brand;
	private double price;
	static final int SIZE = 6;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Phone(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Phone() {
		super();
	}
	
	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}
	public void sendMessage() {
		System.out.println("�ֻ����Է�����");
	}
	
	public void playGame() {
		System.out.println("�ֻ���������Ϸ");
	}
}
