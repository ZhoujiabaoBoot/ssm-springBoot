package com.dzkj.pojo;
/*
 * 地址
 * 
 */
public class Address {
			private Integer aid;
			private Integer userid;
			private String consignee;
			private String tel;
			private String sheng;
			private String city;
			private String county;
			private String delivery;
			private Integer state;
			public Integer getAid() {
				return aid;
			}
			public void setAid(Integer aid) {
				this.aid = aid;
			}
			public Integer getUserid() {
				return userid;
			}
			public void setUserid(Integer userid) {
				this.userid = userid;
			}
			public String getConsignee() {
				return consignee;
			}
			public void setConsignee(String consignee) {
				this.consignee = consignee;
			}
			public String getTel() {
				return tel;
			}
			public void setTel(String tel) {
				this.tel = tel;
			}
			public String getSheng() {
				return sheng;
			}
			public void setSheng(String sheng) {
				this.sheng = sheng;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getCounty() {
				return county;
			}
			public void setCounty(String county) {
				this.county = county;
			}
			public String getDelivery() {
				return delivery;
			}
			public void setDelivery(String delivery) {
				this.delivery = delivery;
			}
			public Integer getState() {
				return state;
			}
			public void setState(Integer state) {
				this.state = state;
			}
			@Override
			public String toString() {
				return "Address [aid=" + aid + ", userid=" + userid + ", consignee=" + consignee + ", tel=" + tel
						+ ", sheng=" + sheng + ", city=" + city + ", county=" + county + ", delivery=" + delivery
						+ ", state=" + state + "]";
			}
			public Address(Integer aid, Integer userid, String consignee, String tel, String sheng, String city,
					String county, String delivery, Integer state) {
				super();
				this.aid = aid;
				this.userid = userid;
				this.consignee = consignee;
				this.tel = tel;
				this.sheng = sheng;
				this.city = city;
				this.county = county;
				this.delivery = delivery;
				this.state = state;
			}
			public Address() {
				super();
			}
			
			
}
