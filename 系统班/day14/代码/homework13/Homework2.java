package com.ujiuye.homework13;

import java.util.ArrayList;
import java.util.ListIterator;

public class Homework2 {
	/*姓名	年龄	性别	地址
	张三	23	男	河南
	李四	45	男	河南
	王五	34	女	山西
	赵六	22	男	上海
	田七	33	女	北京*/
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Person p1 = new Person("张三", 23, "男", "河南");
        list.add(p1);
        list.add(new Person("李四", 45, "男", "河南"));
        list.add(new Person("王五", 34, "女", "山西"));
        list.add(new Person("赵六", 22, "男", "上海"));
        list.add(new Person("田七", 33, "女", "北京"));
        
        ListIterator it = list.listIterator();
        while(it.hasNext()) {
        	 Object obj = it.next();
        	 Person p = (Person)obj;
        	 System.out.println(p.getName() + "--" + p.getAge() + "--" + p.getSex() + "--" + p.getAddress());
        
        	 // 在李四后面添加人的信息
        	 String name = p.getName();
        	 if("李四".equals(name)) {
        		 it.add(new Person("zhao6",24,"女","广州"));
        	 }
        	 
        	 if("王五".equals(name)) {
        		 it.remove();
        	 }
        }
        
        System.out.println(list);
	}
}
