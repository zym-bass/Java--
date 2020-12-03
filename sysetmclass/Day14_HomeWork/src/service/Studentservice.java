package service;

import java.util.List;

import dao.StudentDao;
import entity.PageClass;
import entity.Student;

public class Studentservice {
	StudentDao sd = new StudentDao();

	// 添加学生的业务逻辑
	public boolean addStu(Student s) {
		return sd.addStu(s) > 0 ? true : false;
	}

	// 查询学生信息
	/*public List<Student> queryStu() {
		return sd.queryStu();
	}*/
	//删除学生信息
	public boolean deleteStu(int sno) {
		return sd.deleteStu(sno) > 0 ? true : false;
	}
	// 分页查询学生信息
	/*public List<Student> query2Stu(int n) {
			return sd.query2Stu(n);
	}*/
	//查询修改学生信息
	public Student query3Stu(int n) {
		return sd.query3Stu(n);
	}
	public boolean updateStu(Student s) {
		return sd.updateStu(s) > 0 ? true : false;
	}
	//返回学生总信息条数
	public int queryStuCount() {
		return sd.queryStuCount();
	}
	// 分页查询学生信息
	public List<Student> queryStuByPage(PageClass pages) {
		return sd.queryStuByPage(pages);
	}
	//通过姓名和生日查询是否有此人
	public int querynb(String name , String sbir) {
		int n = sd.querynb(name , sbir);
		return n; 
	}
	//模糊查询
	public void likequery(String sname , String gender ){
		sd.likequery(sname , gender);
}
}
