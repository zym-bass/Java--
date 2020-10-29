package com.yiming.java1028;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        tr.add(1);
        tr.add(3);
        tr.add(4);
        tr.add(2);
        tr.add(-1);
        tr.add(23);
        tr.add(-8);

        double in = parseDouble("1.24242424");
        System.out.println(in);

        Iterator<Integer> it = tr.iterator();
        while(it.hasNext()){
            Integer a = it.next();
            System.out.println(a);
        }
    }
}
