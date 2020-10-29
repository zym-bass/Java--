package com.yiming.java28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTset01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //输入流
        try {
            //创建输入流
            fis = new FileInputStream("F:\\系统班\\day14\\视频\\01.day13内容回顾.mp4");
            fos = new FileOutputStream("C:\\01.day13内容回顾.mp4");

            //一边读一边写
            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            while((readCount=fis.read(bytes)) != -1 ){
                fos.write(bytes,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
