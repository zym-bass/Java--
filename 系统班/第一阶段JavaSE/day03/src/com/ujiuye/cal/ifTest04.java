package com.ujiuye.cal;

public class ifTest04 {
	public static void main(String[] args) {
		// workAge表示员工工龄
		int workAge = 3;
		// salary表示员工基本工资
		double salary = 4688.88;
		if(workAge < 0) {
		System.out.println("工龄有误,无法进行薪资调整");
		}else if(workAge < 5) {
		salary += 2000;
		}else if(workAge < 10) {
		salary += 3000;
		}else if(workAge < 15) {
		salary += 4000;
		}else if(workAge >= 15){
		salary += 5000;
		}

		System.out.println("员工工作了" + workAge + "年,目前薪资为" + salary);
		}

}
