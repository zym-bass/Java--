package com.yiming.java28;

import java.io.*;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建Java对象
        Student s = new Student("笨笨",12);
        //序列化
        ObjectOutputStream oos =new ObjectOutputStream( new FileOutputStream("Student"));
        //序列化对象

        oos.writeObject(s);
        oos.flush();
        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student"));

        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
class Student implements Serializable{
    String name ;
    int age;


    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }
    public Student(String name , int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}