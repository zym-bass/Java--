package com.ujiuye.array;

public class Demo06_��ָ���쳣 {

	public static void main(String[] args) {
         int[] arr = null;
         int[] arr1 = {};
         // NullPointerException
         //  ��    ָ��        �쳣
         // System.out.println(arr.length);
         
        /* if(arr != null) {
        	 System.out.println(arr[0]);
         }else {
        	 System.out.println("���鲻������Ϊnull,��Ϊnull�����޷�����");
         }*/
         getArrayEle(arr,1);
	}
	
	// �����һ���������� : ��ȡ��ָ��int[]��ĳһ������λ��Ԫ��ֵ
	public static int getArrayEle(int[] arr, int index) {
		// ʵ�ʿ�����, ������֤�������, ����֤��������Ԫ��
		if(arr != null && arr.length > 0) {
			if(index >= 0 && index < arr.length) {
				return arr[index];
			}else {
				System.out.println(index + "��������arr������ȷ������Χ֮��, �޷�����, ����Ĭ��ֵΪ0");
				return 0;
			}
		}else {
			System.out.println("���鲻������Ϊnull,��Ϊnull�����޷�����");
			return 0;
		}
		
		
		
		
	}
}
