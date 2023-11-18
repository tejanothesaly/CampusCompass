package com.csit321g2.tejano.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblusercampuscompass")
public class UsercampusEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	
	@Column(name="firstname")
	private String fname;
	
	@Column(name="lastname")
	private String lname;
	
	private String Email;
	
	private String Username;
	
	private String Password;

	public UsercampusEntity() {
		super();
	}
	public UsercampusEntity(int sid, String fname, String lname, String email, String username, String password) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.Email = email;
		this.Username = username;
		this.Password = password;
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

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}