package com.ujiuye.stringbuilder;

public class Demo03_StringBuilder删除功能 {

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helloworld");
        //1.deleteCharAt(int index) : 删除指定index索引位置上的对应的字符, 返回值值为当前正在操作的StringBuilder类型对象本身
        sb.deleteCharAt(3);
        System.out.println(sb);//heloworld
        
        // 2.delete(int beginIndex, int endIndex) : 删除从beginIndex索引开始到endIndex-1索引位置结束, 删除中间的字符序列, 返回当前正在操作的StringBuilder类型对象本身
        sb.delete(1, 5);// elow
        System.out.println(sb);//horld
	}
}
