package com.offcn.service;

import java.util.List;

import com.offcn.dao.DoctorDao;
import com.offcn.dao.RegisterDao;
import com.offcn.entity.Page;
import com.offcn.entity.Register;


public class RegisterService {
	
	private static RegisterDao rd = new RegisterDao();
	private static DoctorDao dd = new DoctorDao();
	//添加挂号信息
	public boolean addRegister(Object[] register) {
		return rd.addRegister(register)>0 ? true : false;
	}
	//模糊查询拼接sql语句
	public void likesql(String rid, String name, String department) {
		rd.likesql(rid,name,department);
		
	}
	
	//查询总挂号信息数
	public int countReg() {
		
		return rd.countReg();
	}
	
	//返回分页查询集合对象
	public List<Register> queryRegister(Page p) {
		// TODO Auto-generated method stub
		List<Register> list = rd.queryRegister(p);
		for(Register reg  :list ) {
			reg.setDoctor(dd.detailsDoc(reg.getDid()));
			
		}
		return list ;
	}
	public boolean delRegister(String rids) {
		// TODO Auto-generated method stub
		return rd.delRegister(rids)>0? true : false;
	}
	public Register detailsReg(String rid) {
		// TODO Auto-generated method stub
		Register reg = rd.detailsReg(rid);
		reg.setDoctor(dd.detailsDoc(reg.getDid()));
		return reg;
	}
	

}
