package model;

import java.util.Date;

	public class Goddess {
		private Integer id;
		private String name;
		private String sex;
		private Integer age;
		private Date birthday;
		private String email;
		private String mobile;
		private String creat_user;
		private String update_user;
		private Date update_date;
		private Date creat_date;
		private Integer isdel;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String  sex) {
			this.sex = sex;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getCreat_user() {
			return creat_user;
		}
		public void setCreat_user(String creat_user) {
			this.creat_user = creat_user;
		}
		public String getUpdate_user() {
			return update_user;
		}
		public void setUpdate_user(String update_user) {
			this.update_user = update_user;
		}
		public Date getUpdate_date() {
			return update_date;
		}
		public void setUpdate_date(Date update_date) {
			this.update_date = update_date;
		}
		public Date getCreat_date() {
			return creat_date;
		}
		public void setCreat_date(Date creat_date) {
			this.creat_date = creat_date;
		}
		public Integer getIsdel() {
			return isdel;
		}
		public void setIsdel(Integer isdel) {
			this.isdel = isdel;
		}
	}
