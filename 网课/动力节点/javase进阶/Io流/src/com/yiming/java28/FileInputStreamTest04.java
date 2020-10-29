package com.yiming.java28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
     int available()
     返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数

     long skip(long n)
     从输入流中跳过并丢弃 n 个字节的数据。
*/
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");
            fis.skip(500);
            byte[] bytes = new byte[fis.available()];
            System.out.print(new String(bytes, 0, fis.read(bytes)));

            
            /*//System.out.println(fis.available());
            byte[] bytes = new byte[fis.available()];
            //int  readCount=  fis.read(bytes);
            System.out.print(new String(bytes, 0, fis.read(bytes)));*/
            /*byte[] bytes = new byte[4];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readCount));
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
