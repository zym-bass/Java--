package com.ujiuye.object;

public class TestObject {

	public static void main(String[] args) {
		// 1. toString
		Person p = new Person();
		String result = p.toString();
		/*public String toString() {
		 *                       带有包路径的类的全名      分隔符     将对象在内存中地址转换成16进制数表示
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }*/
		System.out.println(result);//com.ujiuye.object.Person@15db9742
		
		System.out.println(p+"---");//com.ujiuye.object.Person@15db9742---
		
		// 2. equals
		Person p1 = new Person("张三",20);
		Person p2 = new Person("张三",20);
		System.out.println(p1.equals(p2));// 源代码中比较两个对象内存地址 , false		
	}
}
