package com.ujiuye.homework16;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework01 {
	/*1. ����������
    1) ʹ��File��,��D:�̸�Ŀ¼��,������1���ļ���save,���ļ������ٴ�����2��txt�ļ�,3��docx�ļ�,��2��ppt�ļ�
    2) ��D:\\save�ļ����µĸ��ֺ�׺�����ļ������Ӧ����ͳ�Ƶ�map������, ������� ���磺txt��2����docx��3��......*/ 
	public static void main(String[] args) throws IOException {
        // 1. ������һ���ļ���
		File fu = new File("D:\\save");
		fu.mkdir();
		
		// 2. ��save�ļ����´�����2��txt�ļ�
		File zi1 = new File(fu, "1.txt");
		zi1.createNewFile();
		
		new File(fu,"2.txt").createNewFile();
		
		// 3. ��save�ļ����´�����3��docx�ļ�
		new File(fu,"first.docx").createNewFile();
		new File(fu,"second.docx").createNewFile();
		new File(fu,"third.docx").createNewFile();
		
		// 4. ��save�ļ����´�����2��ppt�ļ�
		new File(fu,"aa.ppt").createNewFile();
		new File(fu,"cc.ppt").createNewFile();
		
		// ������һ��map����, ���ڴ洢�ļ���׺�������Ӧ����֮���ϵ
		HashMap<String, Integer> map = new HashMap<>();
		
		// 5. ��ȡ����save�ļ���·���µ������ļ����ļ���
		File[] fileArr = fu.listFiles();
		// 6. ����fileArr����, ��ȡ��save�ļ����µ�ÿһ���ļ����ļ���
		for(File file : fileArr) {
			// 7. �жϻ�ȡ����file���ļ������ļ���
			if(file.isFile()) {// ���ļ���ȡ��ȡ�ļ��ĺ�׺��
				// 8. ��ȡ��file�ļ�������
				String fileName = file.getName();
				// 9. ��ȡ��fileName�ĺ�׺��, ͨ�� . �и��ļ�����
				String[] fileNameArr = fileName.split("\\.");
				// 10. ��ȡ���ļ��ĺ�׺��
				String endName = fileNameArr[fileNameArr.length-1];
				// 11. ���ļ���׺��������ӵ�map������
				if(map.containsKey(endName)) {
					map.put(endName, map.get(endName)+1);
				}else {
					map.put(endName, 1);
				}
			}
		}
		
		// 12. ����map����
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key + "��" + value + "��   ");
		}
		
    }
}
