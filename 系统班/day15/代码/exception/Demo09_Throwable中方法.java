package com.ujiuye.exception;

public class Demo09_Throwable中方法 {

	public static void main(String[] args) {
		try {
			fun();
		} catch (Exception e) {// = new Exception("数组不能为null");
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
			throw new Exception("数组不能为null");
		 }
	}

}
