package com.ujiuye.staticdemo;

public class Demo01_��̬ʹ��ע������ {
    // �����һ����Ա����
	static int i = 10;
	int j = 20;
	
	public static void main(String[] args) {
		 // 1. Cannot make a static reference to the non-static field i
		 // ��̬�����в���ֱ��ʹ�÷Ǿ�̬��Ա����
		 /*
		  *  ���� : 
		  *  ������ػ����뵽�ڴ���ʱ, ��̬��Ա������ֵ����ʹ��; ��̬����Ҳ����ֱ�ӵ���
		  *    ���ڴ���, û���κζ������; �Ǿ�̬��Ա�������Ŷ��󴴽��ų������ڴ�����ֵ
		 */
         System.out.println(i);// 10
         
         // 2. ���ʹ�÷Ǿ�̬��Ա����, Ҳ�����ȴ�������, ʹ�ö�����.����
         System.out.println(new Demo01_��̬ʹ��ע������().j);
        
         // 3. ��̬�����п���ֱ�ӵ���������̬����
         eat();
        
         // 4. ��̬�����в���ֱ�ӵ��÷Ǿ�̬����, ��������֮��,���Ե���
         //Cannot make a static reference to the non-static method sleep()
         // from the type Demo01_��̬ʹ��ע������
         new Demo01_��̬ʹ��ע������().sleep();
         
         // 5. ��Ϊthis��ʾ��������, ��̬�����ڶ���������ڴ���, ֱ��ʹ��this
         // Cannot use this in a static context
         // System.out.println(this.j);
         
         Demo01_��̬ʹ��ע������.eat();
	}
	
	public static void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}
