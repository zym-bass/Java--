package ocm.ujiuye.object;

public class Demo01 {
	public static void main(String[] args) {
		//匿名对象
		int age1 = new Person().age;
		System.out.println("age");
		
		new Person().eat();//null正在吃饭
	}
}
