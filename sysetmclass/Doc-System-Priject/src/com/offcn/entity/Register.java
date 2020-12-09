package com.offcn.entity;

public class Register {
	private String rid;//病历号
	private String name;//姓名
	private String idCard;//身份证号
	private String siNumber;//社保号
	private double registerMoney;//挂号费
	private String phone;//联系电话
	private int isPay;//是否自费
	private int sex;//性别
	private int age;//年龄
	private int consultation;//初复诊
	private int department ;//部门编号
	private int did;//医生编号
	private String registerDate;//挂号时间
	private String remark;//备注
	private Doctor doctor ;//每个病人对应的医生
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Register [rid=" + rid + ", name=" + name + ", idCard=" + idCard + ", siNumber=" + siNumber
				+ ", registerMoney=" + registerMoney + ", phone=" + phone + ", isPay=" + isPay + ", sex=" + sex
				+ ", age=" + age + ", consultation=" + consultation + ", department=" + department + ", did=" + did
				+ ", registerDate=" + registerDate + ", remark=" + remark + ", doctor=" + doctor + "]";
	}
	public Register(String rid, String name, String idCard, String siNumber, double registerMoney, String phone,
			int isPay, int sex, int age, int consultation, int department, int did, String registerDate,
			String remark) {
		super();
		this.rid = rid;
		this.name = name;
		this.idCard = idCard;
		this.siNumber = siNumber;
		this.registerMoney = registerMoney;
		this.phone = phone;
		this.isPay = isPay;
		this.sex = sex;
		this.age = age;
		this.consultation = consultation;
		this.department = department;
		this.did = did;
		this.registerDate = registerDate;
		this.remark = remark;
	}
	
	
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSiNumber() {
		return siNumber;
	}
	public void setSiNumber(String siNumber) {
		this.siNumber = siNumber;
	}
	public double getRegisterMoney() {
		return registerMoney;
	}
	public void setRegisterMoney(double registerMoney) {
		this.registerMoney = registerMoney;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getIsPay() {
		return isPay;
	}
	public void setIsPay(int isPay) {
		this.isPay = isPay;
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
	public int getConsultation() {
		return consultation;
	}
	public void setConsultation(int consultation) {
		this.consultation = consultation;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + consultation;
		result = prime * result + department;
		result = prime * result + did;
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		result = prime * result + isPay;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((registerDate == null) ? 0 : registerDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(registerMoney);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((rid == null) ? 0 : rid.hashCode());
		result = prime * result + sex;
		result = prime * result + ((siNumber == null) ? 0 : siNumber.hashCode());
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
		Register other = (Register) obj;
		if (age != other.age)
			return false;
		if (consultation != other.consultation)
			return false;
		if (department != other.department)
			return false;
		if (did != other.did)
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (isPay != other.isPay)
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
		if (registerDate == null) {
			if (other.registerDate != null)
				return false;
		} else if (!registerDate.equals(other.registerDate))
			return false;
		if (Double.doubleToLongBits(registerMoney) != Double.doubleToLongBits(other.registerMoney))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (rid == null) {
			if (other.rid != null)
				return false;
		} else if (!rid.equals(other.rid))
			return false;
		if (sex != other.sex)
			return false;
		if (siNumber == null) {
			if (other.siNumber != null)
				return false;
		} else if (!siNumber.equals(other.siNumber))
			return false;
		return true;
	}
	
}
