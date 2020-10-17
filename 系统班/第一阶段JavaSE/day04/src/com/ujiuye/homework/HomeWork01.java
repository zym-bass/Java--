package com.ujiuye.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		muPrint();
	}
	
	//¥Ú”°99≥À∑®±Ì
	public static void muPrint() {
		for(int i = 1 ; i<= 9 ; i++) {
			for(int j = 1 ; j<=i ;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println("\n");
		}
	}
}
