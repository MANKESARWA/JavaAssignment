package com.assisgnment.HRM;

public class Employee {
	private String name,email,address,birthday;

	public Employee(String name, String email, String address, String birthday) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
	}
	
	public void work() {
		System.out.println("The employee can work");
	}
}
