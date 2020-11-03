package com.ujiuye.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo08_高效缓冲字符流案例 {
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(
				 new FileReader("product.txt"));
		 
		 String s;
		 while((s = br.readLine()) != null) {
			 String[] sPro = s.split("\\|");
			 System.out.println(Arrays.toString(sPro));
		 }
		 
		 br.close();
	}
}
