package com.ujiuye.homework07;

public class Person{
    private String name = "����";
    private int age = 20;
    public Person(){
       System.out.println("����ִ����");
    }

   public static void main(String[] args){
	   // ���ÿղ�������, p1�����еĳ�Ա����ֵ : name = "����"; age = 20;
       Person p1 = new Person();// 1.����ִ����
       p1.info();// 2. ��������20��
       
       
       // ���ÿղ�������, p2�����еĳ�Ա����ֵ : name = "����"; age = 20;
       Person p2 = new Person();// 3.����ִ����
       // name = "����";
       p2.name = "����";
       // age = 19;
       p2.age = 19;
       p2.info();// 4. ��������19��

       //��������
       new Person();// 5.����ִ���� 
  }
   
   private void info() {
	   // 2. 
	   System.out.println(this.name + "����" +this.age +"��");
   }
}
