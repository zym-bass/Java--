package ocm.ujiuye.object;

public class TestPerson {
	Person p0 = new Person(10);//�вι���
	
	/*Person p00 = new Person();
	p00.age = 10;*/
	
	public static void main(String[] args) {
		//1. ������һ���������
		//���� ������ = new ����������
		Person p = new Person();
		//2. ��p���������г�Ա������ֵ
		p.name = "��ʤ��";
		p.age = 20;
		p.sex ="��";
		
		//3. ��ȡ����p�еĳ�Ա��������ֵ
		String name = p.name;
		System.out.println(name);
		
		System.out.println(p.sex);
		System.out.println(p.age);
		
		//4.����Person�����еķ���
		p.eat();
		p.sleep();
		p.work();
		
	}

}
