package com.example.model;

public abstract class Person {
	private String name;
	private int age;
	private static int count = 0;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void totalCount() {
		System.out.println("Total count : "+ this.count);
	}
	
	public static void display1() {
		
	}
	
	public abstract void display();

	@Override
	public String toString() {
		
		return "name : "+this.name+"\n age : "+this.age+"\n";
	}
}