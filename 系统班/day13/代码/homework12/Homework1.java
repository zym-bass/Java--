package com.ujiuye.homework12;

import java.util.Arrays;

public class Homework1 {
	/*1. �Լ�����һ���������������£�����һ�����飬����������ת����һ���ַ���
	(������ʹ��Arrays.toString����ֱ��ʵ��)
	���磺����Ϊint[] arr = {1, 2, 3}��ת�������ַ������Ϊ[1, 2, 3]  ,
	ʹ��StringBuilderʵ����Ŀ�е��ַ���ƴ�ӹ���
	
	*  ���� :
	*   1) ��ͷ, ��Ҫƴ��һ��[  , StringBuilderƴ�ӱȽϺ�������ʹ��
	*   2) �������л�ȡ��ÿһ��Ԫ��, ƴ��
	*                ��֤, ��ǰ�����ǲ��������е����һ��Ԫ��
	*                     ��, Ԫ�غ�ƴ��]
	*                     ����, Ԫ�غ�ƴ��,
	*
	*/
	public static void main(String[] args) {
         int[] arr = {1,2,3};
         // 1. sb���ڽ���������Ԫ�ص�ƴ��
         StringBuilder sb = new StringBuilder("[");
         // 2. ��������, ��ȡ�������е�ÿһ��Ԫ��
         for(int index = 0; index < arr.length; index++) {
        	 int ele = arr[index];
        	 // 3. ��֤ele�ǲ������һ��Ԫ��
        	 if(index == arr.length-1) {
        		 sb.append(ele + "]");
        	 }else {
        		 sb.append(ele + ",");
        	 }
         }
         
         System.out.println(sb);
	}
}
