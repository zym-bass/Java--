package com.yiming.java28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("temp");
            //创建byte数组
            byte[] bytes = new byte[4];
            int readCount =0;
            while((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes, 0, readCount));
            }
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
        }
    }
}
