package com.ujiuye.cal;

public class ifTest02 {

public static void main(String[] args) {
	// 需求 : 某公司现在要给员工进行薪资调整, 工作年龄大于等于5年, 
	// 加薪3000元, 工龄不够5年的, 加薪1000元
	
	// workAge表示员工工龄
	int workAge = 5;
	// salary表示员工基本工资
	double salary = 4688.88;
	// 根据员工工龄判断员工涨薪的级别
	if(workAge >= 5) {
	salary += 3000;
	}else {
	salary += 1000;
	}
	System.out.println("员工工作了" + workAge + "年,目前薪资为" + salary);
	}

}
