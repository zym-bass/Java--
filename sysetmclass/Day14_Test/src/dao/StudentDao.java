package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.Student;
import utils.JdbcUtils;


public class StudentDao {
	//添加学生信息
		public int addStu(Student s) {
			int n =0;
			String sql="insert into stu(sname,sbir,photo,hobby)values(?,?,?,?)";
			try {
				n = JdbcUtils.qr.update(sql, s.getSname(),s.getSbir(),s.getPhoto(),s.getHobby());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return n;
		}
		//查询学生信息
		public List<Student> queryStu(){
			List<Student> list = null;
			String sql="select * from stu";
			try {
				list = JdbcUtils.qr.query(sql, new BeanListHandler<>(Student.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		//删除学生信息
		public int deleteStu(int sno) {
			int n = 0;
			String sql ="delete  from stu where sno=?";
			try {
				n= JdbcUtils.qr.update(sql,sno);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return n;
		}
}
