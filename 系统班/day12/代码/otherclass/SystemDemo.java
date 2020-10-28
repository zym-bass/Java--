package com.ujiuye.otherclass;

public class SystemDemo {

	public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        
        for(int i = 0; i <= 1000000; i++) {
        	int w = i + 5;
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-beginTime);
	}
}
