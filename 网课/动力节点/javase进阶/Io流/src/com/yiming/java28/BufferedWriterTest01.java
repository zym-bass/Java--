package com.yiming.java28;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception {

        //字符缓冲输出流
        //BufferedWriter w = new BufferedWriter(new FileWriter("copy"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy")));

        writer.write("好瞌睡\n");
        writer.write("好瞌睡\n");
        writer.write("好瞌睡\n");
        writer.write("好瞌睡\n");

        writer.flush();
        writer.close();

    }
}
