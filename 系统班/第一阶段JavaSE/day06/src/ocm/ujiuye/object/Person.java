package ocm.ujiuye.object;

public class Person {
	//��Ա����
	//����
	String name ;
	//����
	int age ;
	//�Ա�
	String sex;
	public Person() {
		
	}
	public Person(int age){
		this.age =age; 
	}
	//���巽������
	public void eat() {
		System.out.println(name+"���ڳԷ�");
	}
	
	public void sleep() {
		System.out.println(name+"Ŀǰ�Ѿ�˯����"+age+"��");
	}
	
	public void work() {
		System.out.println(name+"��"+sex+"��������"+age);
	}
	/*public static void main(String[] args) {
		
	}*/

}
