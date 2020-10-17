package com.ujiuye.cal;

public class ifTest01 {
	public static void main(String[] args) {
		// 需求 : 某公司现在要给员工进行薪资调整, 工作年龄大于等于5年, 
		// 加薪3000元, 工龄不够5年的, 没有加薪

		// workAge表示员工的工龄
		int workAge = 14;
		// salary表示员工基本工资
		double salary = 5000;
		// 如果工龄大于等于5年, 加薪
		if(workAge >= 5) {
		salary += 3000;// salary = salary + 3000;
		}

		System.out.println("员工工作了" + workAge + "年,目前薪资为" + salary);
		}

}
