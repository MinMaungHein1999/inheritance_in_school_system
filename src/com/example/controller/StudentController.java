package com.example.controller;
import java.io.IOException;

import com.example.model.Person;
import com.example.model.Student;


public class StudentController extends BaseController {

	public StudentController() throws IOException {
		super();
	}

	@Override
	public Person getInfo() throws IOException{
		System.out.print("+++++++ Student Registeration From ++++++++\n");
		System.out.print("Enter Student Name : ");
		String name = getBr().readLine();
		System.out.print("Enter Student Age : ");
		int age = Integer.parseInt(getBr().readLine());
		System.out.print("Enter Student Id : ");
		String stuId = getBr().readLine();
		System.out.print("Enter Student Major : ");
		String major = getBr().readLine();
		
		Person stu = new Student(name, age, stuId, major);
		return stu;
	}
}
