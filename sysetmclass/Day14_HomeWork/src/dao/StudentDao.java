package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import entity.PageClass;
import entity.Student;
import utils.JdbcUtils;


public class StudentDao {
	private static  StringBuffer sqlLike = new StringBuffer("select *from t_stu where 1=1 "); 
	//添加学生信息
		public int addStu(Student s) {
			int n =0;
			String sql="insert into t_stu(sname,sbir,photo,hobby,gender)values(?,?,?,?,?)";
			try {
				n = JdbcUtils.qr.update(sql, s.getSname(),s.getSbir(),s.getPhoto(),s.getHobby(),s.getGender());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n;
		}
		/*//查询学生信息
		public List<Student> queryStu(){
			List<Student> list = null;
			String sql="select * from t_stu";
			try {
				list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Student.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}*/
		//分页显示
		public List<Student> queryStuByPage(PageClass pages){
			List<Student> list = null;
			String sql="select * from ("+sqlLike.toString()+") t limit "+pages.getStartIndex()+","+pages.getNumbers()+"";
			try {
				list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Student.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/*System.out.println("集合大小"+list.size());*/
			return list;
		}
		/*//分页查询学生信息
		public List<Student> query2Stu(int n){
			List<Student> list = null;
			String sql="select * from t_stu limit "+(n-1)*3+",3";
			try {
				list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Student.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("集合大小"+list.size());
			return list;
		}*/
		//删除学生信息
		public int deleteStu(int sno) {
			int n = 0;
			String sql ="delete  from t_stu where sno=?";
			try {
				n= JdbcUtils.qr.update(sql,sno);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return n;
		}
		
		public int queryStuCount() {
			Number n =null;
			String sql = "select count(*) from t_stu";
			try {
				n = (Number)JdbcUtils.qr.query(sql , new ScalarHandler());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return n.intValue();
		}
		public Student query3Stu(int n){
			Student s = null;
			String sql="select * from t_stu where sno=?";
			try {
				s = JdbcUtils.qr.query(sql, new BeanHandler<>(Student.class),n);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return s;
		}
		
		public int updateStu(Student s) {
			int n =0;
			String sql="update t_stu set sname=?,sbir=?,photo=?,hobby=?,gender=?  where sno=?";
			try {
				n = JdbcUtils.qr.update(sql, s.getSname(),s.getSbir(),s.getPhoto(),s.getHobby(),s.getGender(),s.getSno());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n;
		}
		
		////通过姓名和生日查询是否有此人
		public int querynb(String name ,String sbir) {
			String sql = "select count(*) from t_stu where sname=? and sbir=?";
			Number n = null;
			try {
				n = (Number)JdbcUtils.qr.query(sql,new ScalarHandler(),name,sbir);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(n==null) {
				n=0;
			}
			return n.intValue();
		}
		//private static  StringBuffer sqlLike = new StringBuffer("select *from t_stu where 1=1 "); 
		//模糊查询
		public void likequery(String sname , String gender ){
			sqlLike.delete(28,sqlLike.length());
			if(!"".equals(sname) || sname!=null  ) {
				sqlLike.append(" and sname like '%"+sname+"%'");
			}
			if(!"-1".equals(gender)) {
				sqlLike.append(" and gender="+gender);
				
			}
		}
	
}
