package com.example.model;

public class Student extends Person{
	private String studentId;
	private String major;
	private static int count = 0;

	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
		count++;
	}
	
	
	@Override
	public String toString() {
		return super.toString() +"studentId : "+this.studentId+"\n major : "+this.major+"\n\n";
	}
	
	public void totalStudentCount() {
		System.out.println("Total Student count : "+ this.count);
	}

	@Override
	public void display() {
		System.out.print(this);
	}

	public int getCount() {
		return count;
	}
}
