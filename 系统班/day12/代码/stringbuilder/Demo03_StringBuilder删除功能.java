package com.ujiuye.stringbuilder;

public class Demo03_StringBuilderɾ������ {

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helloworld");
        //1.deleteCharAt(int index) : ɾ��ָ��index����λ���ϵĶ�Ӧ���ַ�, ����ֵֵΪ��ǰ���ڲ�����StringBuilder���Ͷ�����
        sb.deleteCharAt(3);
        System.out.println(sb);//heloworld
        
        // 2.delete(int beginIndex, int endIndex) : ɾ����beginIndex������ʼ��endIndex-1����λ�ý���, ɾ���м���ַ�����, ���ص�ǰ���ڲ�����StringBuilder���Ͷ�����
        sb.delete(1, 5);// elow
        System.out.println(sb);//horld
	}
}
