package com.ujiuye.finaldemo;

public class FinalVariable {
	//The blank final field SCHOOL_NAME may not have been initialized
	static final String SCHOOL_NAME = "第一中学";
	
    int j = 88;
	public static void main(String[] args) {
		// 1. final修饰基本数据类型
        final int I = 10;
        // The final local variable i cannot be assigned. 
        // It must be blank and not using a compound assignment
        // I = 20;
        
        // 2. final修饰引用数据类型, 表示这个引用类型变量的地址值不可改变
        final FinalVariable fv = new FinalVariable();
        // fv = new FinalVariable();
        fv.j = 8888;
        // final修饰的变量不能修改
        // fv.SCHOOL_NAME = "二中";
	}
}
