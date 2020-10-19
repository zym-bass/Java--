package ocm.ujiuye.object;

public class TestPerson {
	Person p0 = new Person(10);//有参构造
	
	/*Person p00 = new Person();
	p00.age = 10;*/
	
	public static void main(String[] args) {
		//1. 创建出一个人类对象
		//类名 对象名 = new 类名（）；
		Person p = new Person();
		//2. 给p人类对象进行成员变量赋值
		p.name = "张胜男";
		p.age = 20;
		p.sex ="男";
		
		//3. 获取对象p中的成员变量的数值
		String name = p.name;
		System.out.println(name);
		
		System.out.println(p.sex);
		System.out.println(p.age);
		
		//4.调用Person类型中的方法
		p.eat();
		p.sleep();
		p.work();
		
	}

}
