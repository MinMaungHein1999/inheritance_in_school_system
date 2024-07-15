package com.example.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.controller.BaseController;
import com.example.controller.StudentController;
import com.example.controller.TeacherController;

public class MenuUtil {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void getMenu() throws NumberFormatException, IOException {
		displayMenuInfo();
		int menu = Integer.parseInt(br.readLine());
		BaseController baseController;
		switch(menu) {
		case 1:
			baseController= new StudentController();
			baseController.getInfo();
		case 2:
			baseController= new TeacherController();
			baseController.getInfo();
		case 3:
		default:
			getMenu();
		}		
	}
	
	public static void displayMenuInfo() {
		System.out.println("======Menus=====");
		System.out.println("Student Registeration => 1");
		System.out.println("Teacher Registeration => 2");
		System.out.println("Logout                => 3");
		System.out.print("Chose Menu : ");
	}
}
