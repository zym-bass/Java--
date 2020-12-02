package com.offcn.entity;

public class Users {
	private int uid ;
	private String  name;
	private String  email;
	private String  username ;
	private String  password;
	private String  modifytime;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(String name, String email, String username, String password, String modifytime) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.modifytime = modifytime;
	}
	
	public Users(int uid, String name, String email, String username, String password, String modifytime) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.modifytime = modifytime;
	}
	public Users(String uid, String name, String email, String username, String password, String modifytime) {
		super();
		this.uid = Integer.valueOf(uid);
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.modifytime = modifytime;
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getModifytime() {
		return modifytime;
	}

	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", name=" + name + ", email=" + email + ", username=" + username + ", password="
				+ password + ", modifytime=" + modifytime + "]";
	}
	
}
