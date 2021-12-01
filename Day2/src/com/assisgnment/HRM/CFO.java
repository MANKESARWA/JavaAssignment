package com.assisgnment.HRM;

public class CFO extends Employee{
	private String financeManagementSkills;

	public CFO(String name, String email, String address, String birthday, String financeManagementSkills) {
		super(name, email, address, birthday);
		this.financeManagementSkills = financeManagementSkills;
	}
	
	public void work() {
		System.out.println("This employee work is to manage finance");
	}
	
}
