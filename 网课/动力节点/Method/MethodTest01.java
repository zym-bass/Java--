

public class MethodTest01{
	public static void main(String[] args){
		System.out.println("main begin");
		//调用m1方法	
		m1();
		System.out.println("main begin");
	}
	public static void m1(){
		//调用程序不一定非要写在main函数中，也可以写在其他方法里
		System.out.println("m1 begin");
		m2();
	}
	//m3方法可以调用Tc
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
