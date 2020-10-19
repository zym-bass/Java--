package ocm.ujiuye.object;

public class Person {
	//成员变量
	//姓名
	String name ;
	//年龄
	int age ;
	//性别
	String sex;
	public Person() {
		
	}
	public Person(int age){
		this.age =age; 
	}
	//定义方法功能
	public void eat() {
		System.out.println(name+"正在吃饭");
	}
	
	public void sleep() {
		System.out.println(name+"目前已经睡觉了"+age+"年");
	}
	
	public void work() {
		System.out.println(name+"是"+sex+"，年龄是"+age);
	}
	/*public static void main(String[] args) {
		
	}*/

}
