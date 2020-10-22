package com.ujiuye.homework08;

public class Homework2Test {
	 /* 学生数据信息 :  姓名 : 小明   编号 : 1001  班级号 :  12   成绩: 88
	   教师数据信息 : 姓名 : 李花花  编号: 449   职称 : 教授   部门 : 网络编程*/
	public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("李花花");
        t.setId("449");
        t.setCall("教授");
        t.setDepartment("网络编程");
        
        t.messagePrint();
        
        Student s = new Student("小明","1001","12",88);
        s.messagePrint();
	}
}
