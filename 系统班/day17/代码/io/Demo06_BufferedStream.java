package com.ujiuye.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo06_BufferedStream {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
        		new FileReader("chinese.txt"));
        
        BufferedWriter bw = new  BufferedWriter(
        		new FileWriter("chineseCopy.txt"));
        
        int len;
        while((len = br.read()) != -1) {
        	bw.write(len);
        }
        
        br.close();
        bw.close();
	}
}
