package com.ujiuye.homework07;

public class Person{
    private String name = "张三";
    private int age = 20;
    public Person(){
       System.out.println("构造执行了");
    }

   public static void main(String[] args){
	   // 调用空参数构造, p1对象中的成员变量值 : name = "张三"; age = 20;
       Person p1 = new Person();// 1.构造执行了
       p1.info();// 2. 张三今年20岁
       
       
       // 调用空参数构造, p2对象中的成员变量值 : name = "张三"; age = 20;
       Person p2 = new Person();// 3.构造执行了
       // name = "豆豆";
       p2.name = "豆豆";
       // age = 19;
       p2.age = 19;
       p2.info();// 4. 豆豆今年19岁

       //匿名对象
       new Person();// 5.构造执行了 
  }
   
   private void info() {
	   // 2. 
	   System.out.println(this.name + "今年" +this.age +"岁");
   }
}
