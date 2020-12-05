package com.offcn.entity;

public class Medicine {
	private String mid;//药瓶编号
	private String picture;//图片名
	private String inPrice;//进价
	private String salPrice;//售价
	private String name;//药品名字
	private int type;//药品类型
	private String descs;//简单描述
	private int qualityDate;//保质期
	private String description;//详细说明
	private String produceFirm;//生产厂商
	private String  readme;//服用说明
	private String remark;//备注
	
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Medicine(String picture, String inPrice, String salPrice, String name, int type, String descs,
			int qualityDate, String description, String produceFirm, String readme, String remark) {
		super();
		this.picture = picture;
		this.inPrice = inPrice;
		this.salPrice = salPrice;
		this.name = name;
		this.type = type;
		this.descs = descs;
		this.qualityDate = qualityDate;
		this.description = description;
		this.produceFirm = produceFirm;
		this.readme = readme;
		this.remark = remark;
	}


	public Medicine(String mid, String picture, String inPrice, String salPrice, String name, int type, String descs,
			int qualityDate, String description, String produceFirm, String readme, String remark) {
		super();
		this.mid = mid;
		this.picture = picture;
		this.inPrice = inPrice;
		this.salPrice = salPrice;
		this.name = name;
		this.type = type;
		this.descs = descs;
		this.qualityDate = qualityDate;
		this.description = description;
		this.produceFirm = produceFirm;
		this.readme = readme;
		this.remark = remark;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getInPrice() {
		return inPrice;
	}


	public void setInPrice(String inPrice) {
		this.inPrice = inPrice;
	}


	public String getSalPrice() {
		return salPrice;
	}


	public void setSalPrice(String salPrice) {
		this.salPrice = salPrice;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getDescs() {
		return descs;
	}


	public void setDescs(String descs) {
		this.descs = descs;
	}


	public int getQualityDate() {
		return qualityDate;
	}


	public void setQualityDate(int qualityDate) {
		this.qualityDate = qualityDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProduceFirm() {
		return produceFirm;
	}


	public void setProduceFirm(String produceFirm) {
		this.produceFirm = produceFirm;
	}


	public String getReadme() {
		return readme;
	}


	public void setReadme(String readme) {
		this.readme = readme;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((descs == null) ? 0 : descs.hashCode());
		result = prime * result + ((inPrice == null) ? 0 : inPrice.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + ((produceFirm == null) ? 0 : produceFirm.hashCode());
		result = prime * result + qualityDate;
		result = prime * result + ((readme == null) ? 0 : readme.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((salPrice == null) ? 0 : salPrice.hashCode());
		result = prime * result + type;
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
		Medicine other = (Medicine) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (descs == null) {
			if (other.descs != null)
				return false;
		} else if (!descs.equals(other.descs))
			return false;
		if (inPrice == null) {
			if (other.inPrice != null)
				return false;
		} else if (!inPrice.equals(other.inPrice))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (produceFirm == null) {
			if (other.produceFirm != null)
				return false;
		} else if (!produceFirm.equals(other.produceFirm))
			return false;
		if (qualityDate != other.qualityDate)
			return false;
		if (readme == null) {
			if (other.readme != null)
				return false;
		} else if (!readme.equals(other.readme))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (salPrice == null) {
			if (other.salPrice != null)
				return false;
		} else if (!salPrice.equals(other.salPrice))
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", picture=" + picture + ", inPrice=" + inPrice + ", salPrice=" + salPrice
				+ ", name=" + name + ", type=" + type + ", descs=" + descs + ", qualityDate=" + qualityDate
				+ ", description=" + description + ", produceFirm=" + produceFirm + ", readme=" + readme + ", remark="
				+ remark + "]";
	}
	
	
}
