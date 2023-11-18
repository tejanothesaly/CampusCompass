package com.csit321g2.tejano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcustomer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	
	@Column(name="firstname")
	private String fname;
	
	@Column(name="lastname")
	private String lname;
	
	private String Email;
	
	private float PhoneNumber;

	public CustomerEntity() {
		super();
	}
	public CustomerEntity(int sid, String fname, String lname, String email, float phoneNumber) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.Email = email;
		this.PhoneNumber = phoneNumber;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public float getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(float phoneNumber) {
		PhoneNumber = phoneNumber;
	}
}
