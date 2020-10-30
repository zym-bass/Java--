package com.ujiuye.homework13;

import java.util.LinkedList;

public class LinkedList特有方法 {

	public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        
        System.out.println(list);//[b, a]
        
        list.addLast("c");
        list.addLast("d");
        System.out.println(list);//[b, a, c, d]
        
        System.out.println(list.getFirst());// b
        System.out.println(list.getLast());// d
        
        list.removeFirst();// b
        list.removeLast();// d
        System.out.println(list);//[a, c]
	}

}
