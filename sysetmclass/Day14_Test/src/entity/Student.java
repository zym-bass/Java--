package entity;

	public class Student {
		private int sno;
		private String sname;
		private String photo;
		private String hobby;
		private String sbir;
		public Student(String sname, String photo, String hobby, String sbir) {
			this.sname = sname;
			this.photo = photo;
			this.hobby = hobby;
			this.sbir = sbir;
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
		
}

