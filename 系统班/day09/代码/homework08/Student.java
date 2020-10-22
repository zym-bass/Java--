package com.ujiuye.homework08;

public class Student extends Person {
	private String classNo; 
	private double chengJi;
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public double getChengJi() {
		return chengJi;
	}
	public void setChengJi(double chengJi) {
		this.chengJi = chengJi;
	}
	
	@Override
	public void messagePrint() {
		super.messagePrint();
		System.out.println(classNo + "---" + chengJi);
	}
	
	public Student(String name, String id, String classNo, double chengJi) {
		super(name,id);
		this.classNo = classNo;
		this.chengJi = chengJi;
	}
	
	public Student() {}
}
