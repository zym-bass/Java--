package com.ujiuye.homework4;

public class Homework03 {

/*3. �оٳ�����"��Ҷõ����", ��ͳ����Ҷõ�����ĸ���
    ע : ��Ҷõ���� : ��һ����λ��,����λ�����ֵ��Ĵη���,Ϊ�����ı��� 
    ���� :  8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
    
    *   ���� :
    *     1) ��ȡ������4λ��, ����֪����Щ���ݷ�����Ҷõ��������, ������Ҫ��Ƴ�1000-9999ѭ��
    *     2) ÿ��ѭ����, ���Եõ�һ��4λ��
    *        int ge = 8208 % 10 = 8208 / 10 = 820...8   ��10ȡģ����,ֻ�и�λ��������,��������
    *        int shi = 8208 / 10 = 820 % 10 
    *        int bai = 8208 / 100 = 82 % 10
    *        int qian = 8208 / 1000 = 8    
    *
    */
	public static void main(String[] args) {
		// count��ʾ������, ͳ��������Ҷõ����������
		int count = 0;
        for(int i = 1000; i <= 9999; i++) {
        	int ge = i % 10;
        	int shi = i / 10 % 10;
        	int bai = i / 100 % 10;
        	int qian = i / 1000;
        	
        	int number = ge*ge*ge*ge + shi*shi*shi*shi + bai*bai*bai*bai + qian*qian*qian*qian;
        	if(number == i) {
        		System.out.println(i);
        		count++;
        	}
        }
        
        System.out.println("��Ҷõ��������:" + count);
	}

}
