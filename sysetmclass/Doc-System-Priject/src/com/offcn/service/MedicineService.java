package com.offcn.service;

import java.util.List;

import com.offcn.dao.MedicineDao;
import com.offcn.dao.Picture;
import com.offcn.entity.Doctor;
import com.offcn.entity.Medicine;
import com.offcn.entity.Page;

public class MedicineService {
	private static MedicineDao md = new MedicineDao();
	//添加药品信息
	public boolean addMed(Object[] medicines) {
		return md.addMed(medicines)>0 ? true :false ;
	}
	//返回医生总信息数
	public int queryMedCount() {
		return md.queryMedCount();
	}
	//模糊查询sql语句
	public void fysql(String name ,String type) {
		md.fysql(name, type);
	}
	//分页查询集合
	public List<Medicine> queryMedByPage(Page page) {
		return md.queryMedByPage(page);
	}
	//获取批量删除数据文件名
	public List<Picture> delFile(String mids) {
		return md.delFile(mids);
	}
	//批量删除
	public boolean delMedicine(String mids) {
		return md.delMedicine(mids)>0 ? true : false ; 
	}
	//查询单个医生信息
	public Medicine detailsMed(String did) {
		return md.detailsMed(did);
	}
	//修改单个医生信息
	public boolean modifyMed(Medicine mid) {
		return md.modifyMed(mid)>0? true : false;
	}
}
