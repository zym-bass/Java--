package com.ujiuye.list;

import java.util.ArrayList;
import java.util.List;

public class Demo02_List������������������ʽ {

	public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        for(int index = 0; index < list.size(); index++) {
        	Object obj = list.get(index);
        	String s = (String)obj;
        	System.out.println(s);
        }
	}
}
