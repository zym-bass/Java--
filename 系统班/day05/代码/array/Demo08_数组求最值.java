package com.ujiuye.array;

public class Demo08_��������ֵ {

	public static void main(String[] args) {
         int[] arr = {112,13,55,7,66,88};
         // int[] arr = {};
         
         if(arr != null && arr.length > 0) {
        	 // 1. ����һ��Ĭ�����ֵ, ����0����λĬ��ֵ
             int max = arr[0];
             // 2. ��ȡ������0����֮���ʣ������Ԫ��
             for(int index = 1; index < arr.length; index++) {
            	 int ele = arr[index];
            	 // 3. �������е�ÿһ��Ԫ����Ĭ�����ֵmax���бȽ�, ���ϴ�ֵ��ֵ��max
            	 if(ele > max) {
            		 max = ele;
            	 }
             }
             System.out.println(max);
             
         }else {
        	 System.out.println("����Ϊnull����������û��Ԫ��, ��������ֵ");
         }
	}
}
