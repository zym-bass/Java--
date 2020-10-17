package com.ujiuye.homework4;

public class Homework03 {

/*3. 列举出所有"四叶玫瑰数", 并统计四叶玫瑰数的个数
    注 : 四叶玫瑰数 : 是一个四位数,各个位的数字的四次方和,为该数的本身 
    举例 :  8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
    
    *   分析 :
    *     1) 获取到所有4位数, 才能知道哪些数据符合四叶玫瑰数规则, 于是需要设计出1000-9999循环
    *     2) 每次循环中, 可以得到一个4位数
    *        int ge = 8208 % 10 = 8208 / 10 = 820...8   与10取模运算,只有个位不能整数,被留下来
    *        int shi = 8208 / 10 = 820 % 10 
    *        int bai = 8208 / 100 = 82 % 10
    *        int qian = 8208 / 1000 = 8    
    *
    */
	public static void main(String[] args) {
		// count表示计数器, 统计所有四叶玫瑰数计数器
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
        
        System.out.println("四叶玫瑰数共有:" + count);
	}

}
