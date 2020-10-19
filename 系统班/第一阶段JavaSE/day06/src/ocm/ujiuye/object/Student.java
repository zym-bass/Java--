package ocm.ujiuye.object;

public class Student {
	//姓名
	String name ;
	//班级号
	String classNO;
	//学号
	String id;
	//年龄
	private  int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<100) {
			this.age = age;
			System.out.println(this.age);
		}else {
			System.out.println("age不符合规定，赋值失败");
		}
	}
	
	public void study() {
		System.out.println("");
	}
}
