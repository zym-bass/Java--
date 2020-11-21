package com.ujiuye.domain;

import java.io.Serializable;

public class User implements Serializable {

	 /* `uid` VARCHAR(32) NOT NULL,
	  `username` VARCHAR(100) DEFAULT NULL,
	  `PASSWORD` VARCHAR(100) DEFAULT NULL,*/
	
	private String  uid;
	private String username;
	private String password;
	
	
	public User() {
		super();
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}
