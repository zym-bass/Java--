package com.ujiuye.object;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 测试通过键盘录入基本数据类型
        /*System.out.println("请输入一个字节数据, 范围-128---127");
        byte b = sc.nextByte();
        System.out.println(b);
        
        System.out.println("请输入一个double类型数据:");
        double d = sc.nextDouble();
        System.out.println(d + "----");*/
        
        // 2. 测试通过键盘录入的字符串
        System.out.println("请输入字符串:");
        // 1)next方法功能可以通过空格进行多个数据之间区分(回车换行也可以作为一个输入方法结束标志)
        String first = sc.next();
        String second = sc.next();
        //System.out.println(first + "---" + second);
        
        // admin 123
        System.out.println("请输入一个用户名:");
        /*nextLine()方法如果读取到了回车换行, 那么认为这次数据输入结束; 如果在nextLine()方法之前,
        调用next或者next基本数据类型, 上述方法的回车换行, 就会被nextLine接收并且作为数据结果
        注意的解决方案 : 1) 多调用一次nextLine方法, 用于吸收前面方法多余的回车换行
        2)创建出一个新的Scanner类型对象*/
        //String name1 = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        // 2) nextLine() 方法功能只能通过回车换行进行多个数据之间的切分
        String name = sc1.nextLine();
        System.out.println("请输入一个密码:");
        String password = sc1.nextLine();
        System.out.println(name + "---" + password);
	}
}
