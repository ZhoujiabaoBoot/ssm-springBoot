package com.dzkj.pojo;
/*
 * 
 * 个人中心实体类
 */
public class Users {
		private Integer userid;
		private String name;
		private String uname;
		private String uzname;
		private String usex;
		private String birthday;
		private String tellphone;
		private String email;
		private String pwd;
		private String time;
		private String paypwd;
		private String inmurl;
		private Integer recharge;
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUzname() {
			return uzname;
		}
		public void setUzname(String uzname) {
			this.uzname = uzname;
		}
		public String getUsex() {
			return usex;
		}
		public void setUsex(String usex) {
			this.usex = usex;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getTellphone() {
			return tellphone;
		}
		public void setTellphone(String tellphone) {
			this.tellphone = tellphone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getPaypwd() {
			return paypwd;
		}
		public void setPaypwd(String paypwd) {
			this.paypwd = paypwd;
		}
		public String getInmurl() {
			return inmurl;
		}
		public void setInmurl(String inmurl) {
			this.inmurl = inmurl;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getRecharge() {
			return recharge;
		}
		public void setRecharge(Integer recharge) {
			this.recharge = recharge;
		}
		public Users() {
			super();
		}
		public Users(Integer userid, String name, String uname, String uzname, String usex, String birthday,
				String tellphone, String email, String pwd, String time, String paypwd, String inmurl,
				Integer recharge) {
			super();
			this.userid = userid;
			this.name = name;
			this.uname = uname;
			this.uzname = uzname;
			this.usex = usex;
			this.birthday = birthday;
			this.tellphone = tellphone;
			this.email = email;
			this.pwd = pwd;
			this.time = time;
			this.paypwd = paypwd;
			this.inmurl = inmurl;
			this.recharge = recharge;
		}
		
		
}
