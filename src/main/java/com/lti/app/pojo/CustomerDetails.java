package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookflight01")
public class CustomerDetails {
	
	@Id
	@Column(name="customerid")
	private long customerid;
	@Column(name="customername")
	private String customername;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private String age;
	@Column(name="phoneno")
	private String phoneno;
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Booking [customerid=" + customerid + ", customername=" + customername + ", gender=" + gender + ", age="
				+ age + ", phoneno=" + phoneno + "]";
	}
	public CustomerDetails(long customerid, String customername, String gender, String age, String phoneno) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.gender = gender;
		this.age = age;
		this.phoneno = phoneno;
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
}
