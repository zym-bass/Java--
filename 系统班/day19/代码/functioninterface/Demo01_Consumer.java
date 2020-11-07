package com.ujiuye.functioninterface;

import java.util.function.Consumer;

public class Demo01_Consumer {

	public static void main(String[] args) {
		//�ͻ�1 : ����500Ԫ, ����һ�Ѵ󱦽�
		Consumer<Double> con = x->System.out.println("����"+ x + "Ԫ,����һ�Ѵ󱦽�");
		testConsumer(500,con);
		
		//�ͻ�2 : ����400Ԫ, ����һ˫��Ь
		Consumer<Double> con1 = x->{
			if(x <= 500) {
				System.out.println("�ǳ���ʡ,����" + x + "Ԫ����һ˫��������Ь");
			}else {
				System.out.println("�Ȳ���,��Ǯ");
			}
		};
		testConsumer(400,con1);
	}
	
	/*���� : �����һ����������, �ͻ�����ָ�����, ��Щ��������ѵ�
	�ͻ�1 : ����500Ԫ, ����һ�Ѵ󱦽�
	�ͻ�2 : ����400Ԫ, ����һ˫��Ь
	�ͻ�3 : ����888Ԫ, ����һ�׻���Ʒ
	... ���кܶ�ܶ�Ŀͻ�, ����ָ������в�ͬ������
	
	*
	*  ���� : 
	*    1) ��Ҫ֪���ͻ����ѽ��, double money
	*    2) ��Ҫ֪���ͻ�����money��ô����, ���ǿ��Խ�Cunsumer�ӿ���Ϊ������������,
	*    �൱��ʹ��accept(Double money)
	*/
	
	public static void testConsumer(double money, Consumer<Double> con) {
         con.accept(money);		
	}
}
