package com.yiming.java28;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

*/
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //创建一个File 对象
        File f1 = new File("F:\\file");

        //判断是否存在
        System.out.println(f1.exists());

       /* //如果D://file不存在，则以文件的形式创建出来
        if(!f1.exists()){
            f1.createNewFile();
        }*/

        //以目录的形式创建
        if(!f1.exists()){
            f1.mkdir();
        }

        //创建多重目录
        File f2 = new File("D:\\a\\b\\c\\d");
        if(f2.exists()){
            f2.mkdirs();
        }

        File  f3 = new File("F:\\网课\\动力节点\\第八章面向对象\\src\\Student01.java");

        //获取文件名
        System.out.println("文件名：" + f3. getName());

        //判断是否是一个目录
        System.out.println(f3.isDirectory());

        //判断是否是一个文件
        System.out.println(f3.isFile());

        //获取文件最后修改时间
       /* long lastModified()  返回值是从1970年到现在的总毫秒数
        返回此抽象路径名表示的文件最后一次被修改的时间*/

        Date time = new Date(f3.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(time));

        //获取文件大小
        System.out.println(f3.length());

        //获取当前目录下的子文件
        File f4 = new File("F:\\系统班\\第一阶段JavaSE\\Java基础语法");
        File[] f5 = f4.listFiles();
        for(File a : f5){
            System.out.println( a.getAbsolutePath());
        }

    }
}
