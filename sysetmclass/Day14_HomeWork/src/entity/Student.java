package entity;

	public class Student {
		private int sno;
		private String sname;
		private String photo;
		private String hobby;
		private String sbir;
		private String gender;
		
		public Student(int sno, String sname, String photo, String hobby, String sbir, String gender) {
			super();
			this.sno = sno;
			this.sname = sname;
			this.photo = photo;
			this.hobby = hobby;
			this.sbir = sbir;
			this.gender = gender;
		}
		public Student(String sname, String photo, String hobby, String sbir,String gender) {
			this.sname = sname;
			this.photo = photo;
			this.hobby = hobby;
			this.sbir  = sbir;
			this.gender= gender;
		}
		public Student() {
		}
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		public String getSbir() {
			return sbir;
		}
		public void setSbir(String sbir) {
			this.sbir = sbir;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}

