package com.example.service;

import com.example.model.AdminUser;

public interface AuthenticateService {
	public AdminUser loginUser(String userName, String password);
	public void logoutUser();
	public Boolean isAuthenticated();
}
