package com.offcn.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.offcn.entity.Doctor;
import com.offcn.entity.Page;
import com.offcn.utils.JdbcUtils;

public class DoctorDao {
	private static StringBuffer sqlfy= new StringBuffer( "select *from doctor where 1=1  "); 
	
	//添加管理者
	public int addDoctor(Object[] doctor) {
		String sql = "insert into doctor(name, cardno, phone, sex, age, birthday, email, department, education, remark) values(?,?,? ,?,?,?,?,?,?,?)";
		int n = 0 ;
		try {
			n = JdbcUtils.qr.update(sql,doctor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	//返回医生的总记录数
	public int queryDocCount() {
		String sql = "select count(*) from ("+sqlfy.toString()+") t  ";
		Number n = 0 ;
		try {
			n = (Number) JdbcUtils.qr.query(sql, new ScalarHandler());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n.intValue();
	}
	//分页sql语句
	public void fysql(String name ,String department) {
		sqlfy.delete(30, sqlfy.length());
		if(name!=null) {
			sqlfy.append(" and name like '%"+name+"%'");
		}
		if(!"0".equals(department) && department!=null ) {
			sqlfy.append(" and department="+Integer.valueOf(department));
		}	
	}
	@Test
	public void dosome() {
		fysql(null,"1");
		System.out.println(sqlfy.toString());
	}
	//分页查询
	public List<Doctor> queryDocByPage(Page page) {
		String sql = "select *from ("+sqlfy+") t  limit "+page.getStartIndex()+ ","+page.getNumbers();
		List<Doctor> list = null;
		try {
			list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Doctor.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//删除医生信息
	public int delDoctor(String ids) {
		String sql = "delete from doctor where did in("+ids+")";
		int n = 0 ;
		try {
			n = JdbcUtils.qr.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n ;
	}
	//查询单个医生信息
	public  Doctor detailsDoc(Integer did) {
		String sql = "select *from doctor where did=?";
		Doctor doc= null;
		try {
			doc = JdbcUtils.qr.query(sql, new BeanHandler<>(Doctor.class),did);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	//修改单个医生信息
	public int updateDoc(Doctor doc) {
		String sql = "update doctor set name=?, cardno=?, phone=?, sex=?, age=?, birthday=?, email=?, department=?, education=?, remark=? where did=?";
		int n = 0 ;
		try {
			n = JdbcUtils.qr.execute(sql, doc.getName(),doc.getCardno(),doc.getPhone(),doc.getSex(),doc.getAge(),doc.getBirthday(),doc.getEmail(),doc.getDepartment(),doc.getEducation(),doc.getRemark(),doc.getDid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n ;
	}
}
