package com.yiming.java28;

import java.io.BufferedReader;
import java.io.FileReader;

/*
    BufferdReader:
        带有缓冲区的字符输入流
        使用这个流的时候不能自定义char数组，或者说不需要自定义byte数组，自带缓存

*/
public class BufferedReaderTeat01 {
    public static void main(String[] args)throws Exception {


        FileReader reader = new FileReader("temp");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：字节流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        //像当前这个程序来说：FileReader就是一个节点流。BuffereReader就是包装/处理


        //字符缓存区输入流 有参构造 Reader 或者 Reader , int
        BufferedReader br = new BufferedReader(reader);

        //打印一行
        /*String readLine()
        读取一个文本行。*/
        /*String s = br.readLine();
        System.out.println(s);*/
        String s = null;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }


    }
}
