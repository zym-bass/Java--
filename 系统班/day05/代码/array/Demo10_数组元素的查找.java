package com.ujiuye.array;

public class Demo10_����Ԫ�صĲ��� {

	public static void main(String[] args) {
        int[] arr = {12,99,88,7,88,7};
        //����Ԫ��7������arr�е�һ�γ��ֵ�����λ��
        int ele = 7;
        if(arr != null && arr.length > 0) {
        	// endIndex��ʾԪ��ele�������г��ֵ�����λ��,��ʼֵ��-1,��ʼ��Ϊ�Ҳ���
        	// int endIndex = -1;
        	// 1. ��������arr, ��ȡ�������е�ÿһ��Ԫ��
        	for(int index = 0; index < arr.length; index++) {
        		int arrayEle = arr[index];
        		// 2. ��������Ԫ����Ŀ�����ݽ��бȽ�
        		if(arrayEle == ele) {// �ҵ���
        			//endIndex = index;  ��endIndex��ֵ
        			System.out.println(index);
        			break;
        		}
        		// 3. ��ѭ��ִ�е����һ��, ��û�н���ѭ��,֤��û���ҵ�Ԫ��ele
        		if(index == arr.length-1) {
        			System.out.println("-1");
        		}
        	}
        	
        	//System.out.println(ele + "������arr�е�һ�γ�������λ��Ϊ: "+endIndex);
        	
        }
        
	}
}
