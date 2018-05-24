package com.in28minutes.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDB {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String userType;
	
	
	public UserDB() {
		
	}
	
	public UserDB(String id, String username, String password, String userType) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	
	public String getUsertype() {
		return userType;
	}
	
	public void setUsertype(String userType) {
		this.userType = userType;
	}
	
	
}
