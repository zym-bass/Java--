package com.ujiuye.file;

import java.io.File;
import java.io.IOException;

public class Demo02_FileAddMethod {

	public static void main(String[] args) throws IOException{
		
        File f = new File("D:\\123.txt");
        // createNewFile() : 当File表示的一个文件, 并且文件路径存在, 文件不存在时候, 此方法新建出一个空的文件, 
        // 返回值类型boolean类型, 创建成功返回true
        boolean boo = f.createNewFile();
        System.out.println(boo);
        
        File f1 = new File("D:\\a");
        // 每次只能创建出File类所表示的最后一级文件夹, 如果最后一级文件夹父路径不存在,
        // 创建失败,返回值类型boolean类型, 创建成功返回true
        boolean boo1 = f1.mkdir();
        System.out.println(boo1);
        
        File f2 = new File("D:\\create\\file\\day01");
        // mkdirs() : 每次可以创建一级或者多级文件夹路径, 返回值类型boolean类型, 创建成功返回true
        boolean boo2 = f2.mkdirs();
        System.out.println(boo2);
	}

}
