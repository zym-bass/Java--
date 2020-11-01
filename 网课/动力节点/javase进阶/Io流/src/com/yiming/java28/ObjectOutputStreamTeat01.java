package com.yiming.java28;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTeat01 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(10,"小王"));
        list.add(new User(11,"小李"));
        list.add(new User(12,"小奇"));
        list.add(new User(13,"小赵"));
        list.add(new User(14,"小名"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Users"));

            oos.writeObject(list);

            oos.flush();
            oos.close();

            ObjectInputStream ios = new ObjectInputStream(new FileInputStream("Users"));
            /*Object o = ios.readObject();
            System.out.println(o);*/
            List<User> list1 = (List<User>)ios.readObject();
            for(User u : list1){
                System.out.println(u);
            }
            ios.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
