package com.ujiuye.homework15;

import java.util.Arrays;

public class Homework03 {
	/*3. ʵ����������
	 1)�ֻ�ȡ���û���д��3��������Ϣ������ʽ���Զ��ŷָ����ַ�����ʽ��
	���磺"23,24,25"��ֱ�Ӷ����ַ�����������)������Ҫ��������������ƽ������
	 2) �����ַ���"����@@@����@@����@ì��",ת�����ַ���"����  ����  ����  ì��"\
        (ע�� : ÿ������֮�䶼�������ո�)*/
	public static void main(String[] args) {
         String s = "23,24,25";
         // 1. ʹ��split�������ַ���ʹ��,�����и�
         String[] arr = s.split(",");
         // sum��ʾ�����ܺ�
         int sum = 0;
         // 2. ����arr����, ��ȡ��ÿһ������
         for(String age : arr) {
        	 int i = Integer.parseInt(age);
        	 // 3. ���������ۼӺ�
        	 sum = sum + i;
         }
         
         // 4. ����ƽ������
         System.out.println("ƽ������Ϊ:" + sum / arr.length);
         
         
         
         String name = "����@@@����@@����@ì��";
         String newName = name.replaceAll("[@]{1,}", "  ");
         System.out.println(newName);
	}
}
