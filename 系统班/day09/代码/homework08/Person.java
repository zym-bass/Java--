package com.ujiuye.homework08;

public class Person {
    // ±àºÅ
	private String id; 
	// ÐÕÃû
	private String name; 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void messagePrint() {
		System.out.println(id + "---" + name);
	}

	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		super();
	}
}
