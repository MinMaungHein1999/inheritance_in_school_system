package com.example.model;

public class AdminUser {
	
	private String userName;
	private String password;
	private String role;
	private boolean autheticate = false;
	
	public AdminUser(String userName, String password, String role) {
		this.password = password;
		this.userName = userName;
		this.role = role;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}
	
	public void loginSuccess() {
		this.autheticate = true;
	}
	
	public boolean isAutheticated() {
		return this.autheticate;
	}
	
	public void logout() {
		this.autheticate = false;
	}
}
