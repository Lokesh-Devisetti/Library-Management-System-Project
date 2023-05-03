package com.bitlabs.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLoginPage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String emailId;
	private String password;
	
	
	public UserLoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLoginPage(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String EmailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}