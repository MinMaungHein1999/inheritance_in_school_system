package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.AdminUser;

public class AuthenticateServiceImpl implements AuthenticateService {
	private static List<AdminUser> adminUsers;
	private AdminUser currentUser;
	
	public AuthenticateServiceImpl() {
		adminUsers = new ArrayList<AdminUser>();
		adminUsers.add(new AdminUser("Min Min","admin123","staff"));
		adminUsers.add(new AdminUser("Htet Htet","root","admin"));
		adminUsers.add(new AdminUser("Mg Win","user@123","enduser"));
	}

	@Override
	public AdminUser loginUser(String userName, String password) {
		AdminUser user = findUserByUserNameAndPwd(userName, password);
		if (user != null) {
			user.loginSuccess();
			this.currentUser = user;
			System.out.println("Login Succcessfull!!!");
			System.out.println("==== Welcome "+user.getUserName()+"======");
			return user;
		}else {
			System.out.println("Incorrect credentials!!!");
			return null;
		}
	}
	
	

	@Override
	public void logoutUser() {
		this.currentUser = null;
		this.currentUser.logout();
		
	}
	
	
	private AdminUser findUserByUserNameAndPwd(String username, String password)
	{
		for(AdminUser adminUser : adminUsers) {
			if(adminUser.getUserName().equals(username) && adminUser.getPassword().equals(password)) {
				return adminUser;
			}
		}
		
		return null;
	}

	@Override
	public Boolean isAuthenticated() {
		if(this.currentUser != null) {
			return this.currentUser.isAutheticated();
		}
		return false;
	}
	
}
