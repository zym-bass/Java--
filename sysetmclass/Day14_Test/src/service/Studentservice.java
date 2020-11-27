package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;

public class Studentservice {
	StudentDao sd = new StudentDao();

	// 添加学生的业务逻辑
	public boolean addStu(Student s) {
		return sd.addStu(s) > 0 ? true : false;
	}

	// 查询学生信息
	public List<Student> queryStu() {
		return sd.queryStu();
	}
	//删除学生信息
	public boolean deleteStu(int sno) {
		return sd.deleteStu(sno) > 0 ? true : false;
	}
	
}
