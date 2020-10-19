package ocm.ujiuye.object;

public class VariableUse01 {
	//成员变量
	int i = 130;
	public void useI() {
		
		int i = 20;
		System.out.println(i);
		//System.out.println(i);
		//第一种
		System.out.println(this.i);//this.i == v.i
		//第二种
		VariableUse01 v = new VariableUse01();
		System.out.println(v.i);
		//第三种
		System.out.println(new VariableUse01().i);
		
	}
	
	public static void main(String[] args) {
		VariableUse01 v = new VariableUse01();
		v.useI();
	}

}
