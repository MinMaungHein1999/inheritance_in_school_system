package com.example.controller;
import java.io.IOException;

import com.example.model.Person;
import com.example.model.Teacher;


public class TeacherController extends BaseController {

	public TeacherController() throws IOException {
		super();
	}

	@Override
	public Person getInfo() throws IOException {
		System.out.print("+++++++ Teacher Registeration From ++++++++\n");
		System.out.print("Enter Teacher Name : ");
		String name = getBr().readLine();
		System.out.print("Enter Teacher Age : ");
		int age = Integer.parseInt(getBr().readLine());
		System.out.print("Enter Employee Id : ");
		String tchalId = getBr().readLine();
		System.out.print("Enter Teacher Major : ");
		String major = getBr().readLine();
		
		Person stu = new Teacher(name, age, tchalId, major);
		return stu;
	}
}
