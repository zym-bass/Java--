package com.ujiuye.finaldemo;

public class FinalVariable {
	//The blank final field SCHOOL_NAME may not have been initialized
	static final String SCHOOL_NAME = "��һ��ѧ";
	
    int j = 88;
	public static void main(String[] args) {
		// 1. final���λ�����������
        final int I = 10;
        // The final local variable i cannot be assigned. 
        // It must be blank and not using a compound assignment
        // I = 20;
        
        // 2. final����������������, ��ʾ����������ͱ����ĵ�ֵַ���ɸı�
        final FinalVariable fv = new FinalVariable();
        // fv = new FinalVariable();
        fv.j = 8888;
        // final���εı��������޸�
        // fv.SCHOOL_NAME = "����";
	}
}
