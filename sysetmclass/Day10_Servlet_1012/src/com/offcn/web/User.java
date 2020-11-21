package com.offcn.web;

public class User {
	private int sno ;
	private String sname;
	public User() {
		
	}
	public User(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "User [sno=" + sno + ", sname=" + sname + "]";
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
