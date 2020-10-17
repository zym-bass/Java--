package com.ujiuye.cal;

public class ifTest03 {

public static void main(String[] args) {
	/*需求 : 某公司现在要给员工进行薪资调整,根据工龄决定涨薪的级别
	1)[0-5) : 涨薪2000元
	2)[5-10) : 涨薪3000元
	3)[10-15) : 涨薪4000元
	4)[15,以上) : 涨薪5000元*/
	
	// workAge表示员工工龄
	int workAge = -15;
	// salary表示员工基本工资
	double salary = 4688.88;
	if(workAge < 0) {
	System.out.println("工龄有误,无法进行薪资调整");
	}else if(workAge >= 0 && workAge < 5) {
	salary += 2000;
	}else if(workAge >= 5 && workAge < 10) {
	salary += 3000;
	}else if(workAge >= 10 && workAge < 15) {
	salary += 4000;
	}else {
	salary += 5000;
	}
	
	System.out.println("员工工作了" + workAge + "年,目前薪资为" + salary);
	
	}
}
