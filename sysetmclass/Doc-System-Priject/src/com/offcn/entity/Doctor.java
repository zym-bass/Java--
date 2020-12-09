package com.offcn.entity;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Doctor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int did;//医生编号
	private String name;//姓名
	private String cardno;//身份证
	private String phone;//手机号
	private int sex;//性别
	private int age;//年龄
	private String birthday;//生日
	private String email;//邮箱
	private int  department;//科室
	private int education;//学历
	private String remark;//备注
	public Doctor() {
	}
	public Doctor(String name, String cardno, String phone, int sex, int age, String birthday, String email,
			int department, int education, String remark) {
		this.name = name;
		this.cardno = cardno;
		this.phone = phone;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.email = email;
		this.department = department;
		this.education = education;
		this.remark = remark;
	}
	public Doctor(int did, String name, String cardno, String phone, int sex, int age, String birthday, String email,
			int department, int education, String remark) {
		super();
		this.did = did;
		this.name = name;
		this.cardno = cardno;
		this.phone = phone;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.email = email;
		this.department = department;
		this.education = education;
		this.remark = remark;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((cardno == null) ? 0 : cardno.hashCode());
		result = prime * result + department;
		result = prime * result + did;
		result = prime * result + education;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + sex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (age != other.age)
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (cardno == null) {
			if (other.cardno != null)
				return false;
		} else if (!cardno.equals(other.cardno))
			return false;
		if (department != other.department)
			return false;
		if (did != other.did)
			return false;
		if (education != other.education)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", cardno=" + cardno + ", phone=" + phone + ", sex=" + sex
				+ ", age=" + age + ", birthday=" + birthday + ", email=" + email + ", department=" + department
				+ ", education=" + education + ", remark=" + remark + "]";
	}

}
