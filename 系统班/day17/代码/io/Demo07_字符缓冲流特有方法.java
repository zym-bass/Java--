package com.ujiuye.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo07_�ַ����������з��� {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
        		new FileReader("javaCode.txt"));
        
        BufferedWriter bw = new  BufferedWriter(
        		new FileWriter("javaCodeCopy.txt"));
        
        // s��ʾÿ�ζ�ȡ����һ������
        String s;
        while((s = br.readLine()) != null) {
        	bw.write(s);
        	// ���ļ���д��س�����
        	bw.newLine();
        }
        
        bw.close();
        br.close();
	}

}
