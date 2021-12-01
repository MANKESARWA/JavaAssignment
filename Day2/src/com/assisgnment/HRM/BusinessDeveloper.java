package com.assisgnment.HRM;

public class BusinessDeveloper extends Employee {
	private String specializedDomains;
	
	
	public BusinessDeveloper(String name, String email, String address, String birthday, String specializedDomains) {
		super(name, email, address, birthday);
		this.specializedDomains = specializedDomains;
	}

	@Override
	public void work() {
		System.out.println("This employee work is to collect,analyze all requirement and write documents");
	}
	
	
}
