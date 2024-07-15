package com.example.model;

public class Teacher extends Person{
	private String employeeId;
	private String subject;
	private static int count = 0;

	public Teacher(String name, int age, String employeeId, String subject) {
		super(name, age);
		this.employeeId = employeeId;
		this.subject = subject;
		count++;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n employeeId : "+this.employeeId+"\n subject : "+this.subject;
	}
	
	public void totalTeacherCount() {
		System.out.println("Total Teacher count : "+ getCount());
	}

	@Override
	public void display() {
		System.out.print(this);
	}

	@Override
	public void totalCount() {
		super.totalCount();
	}
	
	
	public int getCount() {
		return count;
	}

}
