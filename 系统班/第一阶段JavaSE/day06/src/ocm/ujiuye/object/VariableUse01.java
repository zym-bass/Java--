package ocm.ujiuye.object;

public class VariableUse01 {
	//��Ա����
	int i = 130;
	public void useI() {
		
		int i = 20;
		System.out.println(i);
		//System.out.println(i);
		//��һ��
		System.out.println(this.i);//this.i == v.i
		//�ڶ���
		VariableUse01 v = new VariableUse01();
		System.out.println(v.i);
		//������
		System.out.println(new VariableUse01().i);
		
	}
	
	public static void main(String[] args) {
		VariableUse01 v = new VariableUse01();
		v.useI();
	}

}
