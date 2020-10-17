public class MethodTest04{
	//主方法：入口
	public static void main(String[] args){
		System.out.println("main begin");
		int i = 100;
		m1(i);
		System.out.println("Hello begin");
	}
	public static void m1 (int i){
		System.out.println("m1 begin");
		m2(i);
		System.out.println("m1 over");
	}
	public static void m2 (int i){
		System.out.println("m2 begin");
		m3(i);
		System.out.println("m2 over");
	}
	public static void m3 (int i){ //i 三个局部变量 局部变量只在方法体内有效
		System.out.println("m3 begin");
		System.out.println(i);
		System.out.println("m3 over");
	}
	//方法写好但没有用 方法存在方法区  方法使用进栈（压栈） 方法退出push出栈（弹栈）
	

}