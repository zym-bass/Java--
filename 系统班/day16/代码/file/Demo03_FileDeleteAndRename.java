package com.ujiuye.file;

import java.io.File;

public class Demo03_FileDeleteAndRename {

	public static void main(String[] args) {
          File f = new File("D:\\123.txt");
          // 1. 直接删除文件, 如果文件真实存在, 删除成功
          System.out.println(f.delete()); 
          
          File f1 = new File("D:\\a");
          // 2. 直接删除一个空的文件夹, 删除功能
          System.out.println(f1.delete());
          
          File f2 = new File("D:\\create");
          // 3. 删除非空文件夹, 删除失败
          System.out.println(f2.delete());
          
          File f3 = new File("D:\\aa.txt");
          // 4. f3的路径与参数路径一致, 只表示文件重命名
          f3.renameTo(new File("D:\\aabbc.txt"));
          File f4 = new File("D:\\bb.txt");
          
          // 5. f3的路径与参数路径不一致 , 先将f3表示的文件剪切到目标参数路径下, 再重命名为change.txt
          f4.renameTo(new File("D:\\1012系统班\\change.txt"));
	}

}
