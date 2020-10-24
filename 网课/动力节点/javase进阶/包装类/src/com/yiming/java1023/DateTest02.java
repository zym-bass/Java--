package com.yiming.java1023;

//System方法
// System.out  out是System的静态变量
// System.out.println()
// System.gc() 建议启动垃圾回收器
// System.currentTimeMillis(); 获取从1970年到现在的毫秒数
// System.exit(0); 退出JVM
public class DateTest02 {
    public static void main(String[] args){
        //获取从1970年0000到现在的毫秒数
        long nowTimeNillis = System.currentTimeMillis();
        System.out.println(nowTimeNillis);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println(end-begin);

    }
    public static void print(){
        for(int i = 0 ; i < 1000000000 ;i++){
           // System.out.println("i=" + i);
        }
    }
}
