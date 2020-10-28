package com.yiming.java28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.FileInputStream
        1. 文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
        2. 字节的方式，完成输入的操作，完成读的操作（硬盘——> 内存）

*/
public class FileInputStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = null;
        try {
            //创建文件字节输入流
            //F:\Java--\file\temp
            fis = new FileInputStream("F:\\Java--\\file\\temp");
            //FileInputStream input = new FileInputStream("F:/Java--/file/temp");

            //开始读
            StringBuilder s = new StringBuilder();
           /* while(true){
                int readData = fis.read();
                if(readData==-1){
                    break;
                }
                 s.append((char)readData);
            }*/
            int readData = 0;
            while((readData = fis.read())!=-1 ){
                s.append((char)readData);
            }
            System.out.println(s);
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //在finally 当中确保流一定关闭
            if(fis!=null){//避免空指针异常
                //关闭的前提示：流不是空，流是null的时候没有必要关闭
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
}
