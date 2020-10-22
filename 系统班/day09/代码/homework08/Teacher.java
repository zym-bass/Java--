package com.ujiuye.homework08;

public class Teacher extends Person {
	private String call;  
	private String department;
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void messagePrint() {
		super.messagePrint();
		System.out.println(call + "---" + department);
	}
}
