package com.yiming.java28;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BufferedReadTest01 {
    public static void main(String[] args) {

        FileInputStream in = null;
        try {
            //字节流
            in = new FileInputStream("temp");

            //转换流
            InputStreamReader zhuanh = new InputStreamReader(in);

            //缓冲区
            BufferedReader reader = new BufferedReader(zhuanh);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream("temp")));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
