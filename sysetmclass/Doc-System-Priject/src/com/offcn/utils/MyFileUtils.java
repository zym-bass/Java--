package com.offcn.utils;

import java.io.File;

public class MyFileUtils {
	public static void deleteFile(String scrFileName){
        try{
            File file = new File(scrFileName);
            file.delete();
        }catch(Exception e){
        	System.out.println("文件删除异常");
            e.printStackTrace();
        }
    }
}
