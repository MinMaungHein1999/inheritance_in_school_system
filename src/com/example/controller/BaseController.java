package com.example.controller;

import java.io.BufferedReader;
import com.example.service.*;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.AdminUser;
import com.example.model.Person;

public abstract class BaseController {
	private static BufferedReader br;
	private AuthenticateService authenticateService;
	public boolean authenticate = false ;
	
	public BaseController() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		authenticateService = new AuthenticateServiceImpl();
		this.authenticate = authenticateService.isAuthenticated();
		while(!this.authenticate) {
			System.out.println("********* LoginPage *********");
			System.out.print("Enter Username : ");
			String username = br.readLine();
			System.out.print("Enter Password : ");
			String password = br.readLine();
			AdminUser adminUser = this.authenticateService.loginUser(username, password);
			if(adminUser != null) { this.authenticate = true; } else { this.authenticate = false; }
		}
	}
	
	public abstract Person getInfo() throws IOException; 
		
	public static BufferedReader getBr() {
		return br;
	}
}
