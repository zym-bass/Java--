package com.ujiuye.exception;

public class Demo09_Throwable�з��� {

	public static void main(String[] args) {
		try {
			fun();
		} catch (Exception e) {// = new Exception("���鲻��Ϊnull");
			String s = e.getMessage();
			System.out.println(s);
			
			String s1 = e.toString();
			System.out.println(s1);
			
			e.printStackTrace();
		}
		System.out.println("game over");
	}
	
	public static void fun() throws Exception {
		 int[] arr = null;
		 
		 if(arr == null) {
			throw new Exception("���鲻��Ϊnull");
		 }
	}

}
