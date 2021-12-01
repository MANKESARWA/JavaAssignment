package com.assisgnment.HRM;

public class CEO extends Employee{
	
	private String vision,mission;

	public CEO(String name, String email, String address, String birthday, String vision, String mission) {
		super(name, email, address, birthday);
		this.vision = vision;
		this.mission = mission;
	}
	
	@Override
	public void work() {
		System.out.println("This employee work is executive work");
	}

}
