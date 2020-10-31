package com.yiming.java28;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*

    java.io.DataOutputStream:数据专属的流
    这个流可以将数据连同数据的类型一并写入文件中
    注意：这个文件不是普通文本文档（记事本打不开）
*/
public class  DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("copy"));
        int a = 10;
        String b = "qwe";
        short c = 10;
        char d = 'c';
        dos.writeInt(a);
        dos.writeShort(c);
        dos.writeChar(d);
        dos.writeBytes(b);
        dos.flush();
        dos.close();
    }
}
