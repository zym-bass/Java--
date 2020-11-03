package com.ujiuye.homework16;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework01 {
	/*1. 完成下面代码
    1) 使用File类,在D:盘根目录下,创建出1个文件夹save,该文件夹下再创建出2个txt文件,3个docx文件,和2个ppt文件
    2) 将D:\\save文件夹下的各种后缀名的文件和其对应个数统计到map集合中, 遍历结果 例如：txt有2个，docx有3个......*/ 
	public static void main(String[] args) throws IOException {
        // 1. 创建出一个文件夹
		File fu = new File("D:\\save");
		fu.mkdir();
		
		// 2. 在save文件夹下创建出2个txt文件
		File zi1 = new File(fu, "1.txt");
		zi1.createNewFile();
		
		new File(fu,"2.txt").createNewFile();
		
		// 3. 在save文件夹下创建出3个docx文件
		new File(fu,"first.docx").createNewFile();
		new File(fu,"second.docx").createNewFile();
		new File(fu,"third.docx").createNewFile();
		
		// 4. 在save文件夹下创建出2个ppt文件
		new File(fu,"aa.ppt").createNewFile();
		new File(fu,"cc.ppt").createNewFile();
		
		// 创建出一个map集合, 用于存储文件后缀名与其对应数量之间关系
		HashMap<String, Integer> map = new HashMap<>();
		
		// 5. 获取到到save文件夹路径下的所有文件和文件夹
		File[] fileArr = fu.listFiles();
		// 6. 遍历fileArr数组, 获取到save文件夹下的每一个文件和文件夹
		for(File file : fileArr) {
			// 7. 判断获取到的file是文件还是文件夹
			if(file.isFile()) {// 是文件采取获取文件的后缀名
				// 8. 获取到file文件的名字
				String fileName = file.getName();
				// 9. 获取到fileName的后缀名, 通过 . 切割文件名字
				String[] fileNameArr = fileName.split("\\.");
				// 10. 获取到文件的后缀名
				String endName = fileNameArr[fileNameArr.length-1];
				// 11. 将文件后缀以数量添加到map集合中
				if(map.containsKey(endName)) {
					map.put(endName, map.get(endName)+1);
				}else {
					map.put(endName, 1);
				}
			}
		}
		
		// 12. 遍历map集合
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key + "有" + value + "个   ");
		}
		
    }
}
