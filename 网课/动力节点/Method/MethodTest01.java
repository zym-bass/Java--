

public class MethodTest01{
	public static void main(String[] args){
		System.out.println("main begin");
		//����m1����	
		m1();
		System.out.println("main begin");
	}
	public static void m1(){
		//���ó���һ����Ҫд��main�����У�Ҳ����д������������
		System.out.println("m1 begin");
		m2();
	}
	//m3�������Ե���Tc
	public static void m2(){
		System.out.println("m2 begin");
		T.m3();
	}
}
class T{
	public static void m3(){
		System.out.println("T's m3 method execute!");
	}
}
