package com.offcn.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.offcn.entity.Doctor;
import com.offcn.entity.Medicine;
import com.offcn.entity.Page;
import com.offcn.utils.JdbcUtils;

public class MedicineDao {
	private static StringBuffer sqlfy= new StringBuffer( "select *from medicine where 1=1 ");
	
	//添加用户
	public int  addMed(Object[]  medicines) {
		String sql = "insert into medicine values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			return JdbcUtils.qr.execute(sql, medicines);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0 ;
	}
	//分页sql语句
	public void fysql(String name ,String type) {
		sqlfy.delete(32, sqlfy.length());
		if(name!=null) {
			sqlfy.append(" and name like '%"+name+"%'");
		}
		if(!"0".equals(type)) {
			sqlfy.append(" and type="+Integer.valueOf(type));
		}	
	}
	//分页查询
	public List<Medicine> queryMedByPage(Page page) {
		String sql = "select *from ("+sqlfy+") t  limit "+page.getStartIndex()+ ","+page.getNumbers();
		List<Medicine> list = null;
		try {
			list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Medicine.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//返回药品的总记录数
	public int queryMedCount() {
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
	//获取批量删除的文件名
	public List<Picture> delFile(String mids) {
		
		String sql = "select picture from medicine where mid in("+mids+")";
		System.out.println(sql);
		try {
			return JdbcUtils.qr.query(sql,new BeanListHandler<>(Picture.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}
	@Test
	public void dos() {
		MedicineDao md  = new MedicineDao();
		System.out.println("=========================="+md.delFile("1607138437724")+"======================");
	}
	//批量删除药品
	public int delMedicine(String mids) {
		
		String sql = "delete from medicine where  mid in("+mids+")";
		try {
			return JdbcUtils.qr.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0 ;
	}
	//查询单个药品信息
	public  Medicine detailsMed(String  mid) {
		String sql = "select *from medicine where mid=?";
		Medicine med= null;
		try {
			med = JdbcUtils.qr.query(sql, new BeanHandler<>(Medicine.class),mid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return med;
	}
	//修改单个医生信息
	public int modifyMed(Medicine med) {
		String sql = "update medicine set picture=?, inPrice=?, salPrice=?, name=?, type=?, descs=?, qualityDate=?, description=?, produceFirm=?, readme=?, remark=?  where mid=?";
		
		int n = 0 ;
		try {
			n = JdbcUtils.qr.execute(sql,med.getPicture(),med.getInPrice(),med.getSalPrice(),med.getName(),med.getType(),med.getDescs(),med.getQualityDate(),med.getDescription(),med.getProduceFirm(),med.getReadme(),med.getRemark(),med.getMid() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n ;
	}
}
