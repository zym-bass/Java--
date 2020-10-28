package com.yiming.java28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    int raed(byte[] b)
    一次最多读取b.length的字节数量
*/
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        //创建文件字节输入流
        FileInputStream fis = null;
        try {

            fis =  new FileInputStream("temp");
            //创建长度为4的byte数组
            byte[] a = new byte[4];
            //int   read(byte[] bytes)  返回值int  读取四个字节长度的数据放入byte数组中 若没有返回-1
            int readCount =fis.read(a);

            System.out.println(readCount);
            //String构造方法（byte[] bytes , int start 下标起始值， int length 长度）
            System.out.println(new String(a,0,readCount));

            readCount =fis.read(a);
            System.out.println(readCount);

            System.out.println(new String(a,0,readCount));
            readCount =fis.read(a);

            System.out.println(readCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                 fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
