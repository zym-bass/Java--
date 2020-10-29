package com.yiming.java28;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTset01 {
    public static void main(String[] args){
        FileOutputStream out =null;
        try {
            //当路径没有myfile时 会自动创建文件
            //这样写会一直清空原文件内容，然后再进行写入
            //out = new FileOutputStream("myfile");
            //加上true表示追加
            out = new FileOutputStream("myfile",true);
            byte[] bytes ={97,98,99,100};
            out.write(bytes);
            out.write(bytes,0,2);

            String s = "\n我是啦啦啦";
            byte[] bytes1 = s.getBytes();
            out.write(bytes1);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
