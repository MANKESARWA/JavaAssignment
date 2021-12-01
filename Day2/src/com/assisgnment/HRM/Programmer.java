package com.assisgnment.HRM;

public class Programmer extends Employee{
	private String programmingLanguage;

	public Programmer(String name, String email, String address, String birthday, String programmingLanguage) {
		super(name, email, address, birthday);
		this.programmingLanguage = programmingLanguage;
	}
	@Override
	public void work() {
		System.out.println("This Employee work is to coding and fixing bugs");
	}
	
}
