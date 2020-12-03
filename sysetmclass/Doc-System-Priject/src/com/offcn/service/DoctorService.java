package com.offcn.service;

import java.util.List;

import com.offcn.dao.DoctorDao;
import com.offcn.entity.Doctor;
import com.offcn.entity.Page;

public class DoctorService {
	private static DoctorDao dd = new DoctorDao();
	//添加医生信息
	public boolean  addDoctor (Object[] doctor) {
		return dd.addDoctor(doctor)>0 ? true : false;
	}
	//返回医生总信息数
	public int queryDocCount() {
		return dd.queryDocCount();
	}
	//分页查询集合
	public List queryDocByPage(Page page) {
		return dd.queryDocByPage(page);
	}
	//模糊查询sql语句
	public void fysql(String name ,String department) {
		dd.fysql(name, department);
	}
	//删除医生信息
	public boolean delDoctor(String ids) {
		return dd.delDoctor(ids)>0 ? true : false;
	}
	//查询单个医生信息
	public Doctor detailsDoc(Integer did) {
		return dd.detailsDoc(did);
	}
	//修改单个医生信息
	public boolean updateDoc(Doctor doc) {
		return dd.updateDoc(doc)>0? true : false;
	}
}
