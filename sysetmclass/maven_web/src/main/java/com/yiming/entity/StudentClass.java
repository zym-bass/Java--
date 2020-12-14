package com.yiming.entity;

public class StudentClass {
	private String username ;
	private String password ;
	
	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentClass(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
