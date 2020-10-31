package com.yiming.java28;

import java.io.*;

public class PracticeTest01 {
    public static void main(String[] args) {
        //复制选择目录
        File startFile =new File("F:\\系统班\\day15");

        //选择粘贴目录
        File desFile = new File("E:\\");

        //拷贝文件
        copyDir(startFile,desFile);

        //选择要复制
        //复制目录所有子目录
        //在每一个目录下copy
    }
    public static void copyDir(File srcFile , File destFile){
        if(srcFile.isFile()){
            FileInputStream in = null;
            FileOutputStream out = null;


            try {
                in = new FileInputStream(srcFile);
                out = new FileOutputStream(((destFile.getAbsolutePath().endsWith("\\")? destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3)));


                byte[] bytes = new byte[1024*1024];
                int readCount =0;
                while((readCount = in.read(bytes))!=-1){
                    out.write(bytes,0,readCount);
                }

                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                if(out !=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(in != null){
                    try{
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            return;
        }
        //获取子目录
        File[] files = srcFile.listFiles();
        for(File file : files){
            //获取所有文件的（包括目录和文件）绝对路径
            // System.out.println(file.getAbsolutePath());

            //在递归中如果是目录得需要创建目录
            if(file.isDirectory()){
                String srcDir = file.getAbsolutePath();
                String desDir = ((destFile.getAbsolutePath().endsWith("\\")? destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcDir.substring(3));
                File newFile = new File(desDir);
                if(!(newFile.exists())){
                    newFile.mkdirs();
                }
            }


            //递归调用
            copyDir(file,destFile);
        }


    }
}
