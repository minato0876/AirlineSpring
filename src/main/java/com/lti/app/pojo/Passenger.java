package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration99")
public class Passenger {
	
	
	@Column(name="title")
	private String title;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="cpassword")
	private String cpassword;
	@Column(name="dob")
	private String dob;
	@Column(name="phoneno")
	private long phoneno;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Passenger [title=" + title + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", cpassword=" + cpassword + ", dob=" + dob + ", phoneno="
				+ phoneno + "]";
	}
	public Passenger(String title, String firstname, String lastname, String username, String password,
			String cpassword, String dob, long phoneno) {
		super();
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.cpassword = cpassword;
		this.dob = dob;
		this.phoneno = phoneno;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
