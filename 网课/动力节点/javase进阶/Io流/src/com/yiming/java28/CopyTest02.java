package com.yiming.java28;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        //字符输入流
        FileReader in = null;

        //字符输出流
        FileWriter out = null;

        try {

            in = new FileReader("temp");

            out = new FileWriter("C:\\temp");

            //一边读一边写
            char[] chars = new char[4];
            int readCount = 0 ;
            while((readCount = in.read(chars)) !=-1 ){
                out.write(chars,0,readCount);
            }

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
