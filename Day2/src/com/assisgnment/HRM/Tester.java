package com.assisgnment.HRM;

public class Tester extends Employee{
	private String testingMethodologies;

	public Tester(String name, String email, String address, String birthday, String testingMethodologies) {
		super(name, email, address, birthday);
		this.testingMethodologies = testingMethodologies;
	}
	public void work() {
		System.out.println("This employee work is testinga and verification");
		
	}
	
	
	
}
