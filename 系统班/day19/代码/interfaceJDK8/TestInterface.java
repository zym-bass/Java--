package com.ujiuye.interfaceJDK8;

public class TestInterface {

	public static void main(String[] args) {
      // 1. ����ʵ�������ֱ�ӵ��ø��ӿ��е�Ĭ�Ϲ���
		InterfaceJDK8Impl impl = new InterfaceJDK8Impl();
		impl.eat();
		impl.sleep();
		impl.fun();
		
		// 2. ����ʵ�����븸�ӿ��о�̬����֮���ʹ��
		//InterStaticImplʵ����û�м̳е����ӿ��еľ�̬����
		// InterStaticImpl.function();
		MyInterStaticMethod.function();
	}
}
