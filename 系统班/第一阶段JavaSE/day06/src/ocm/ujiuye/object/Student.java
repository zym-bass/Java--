package ocm.ujiuye.object;

public class Student {
	//����
	String name ;
	//�༶��
	String classNO;
	//ѧ��
	String id;
	//����
	private  int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<100) {
			this.age = age;
			System.out.println(this.age);
		}else {
			System.out.println("age�����Ϲ涨����ֵʧ��");
		}
	}
	
	public void study() {
		System.out.println("");
	}
}
