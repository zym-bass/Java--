package com.yiming.java1025;

import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
   public static void main(String[] args){
       List list = new LinkedList();
       list.add("a");
       list.add("b");
       list.add("c");
       list.add("d");

       for(int i = 0 ; i < list.size() ; i++){
           Object o = list.get(i);
           System.out.println(o);
       }

       List list2 = new LinkedList();
       list2.add("a");
       list2.add("b");
       list2.add("c");
       list2.add("d");

       for(int i = 0; i < list2.size() ; i++){
           Object o = list2.get(i);
           System.out.println(o);
       }


   }
}
