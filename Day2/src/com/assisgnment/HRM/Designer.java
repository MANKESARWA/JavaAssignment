package com.assisgnment.HRM;

public class Designer extends Employee {
	private String designPhilosopgy,designToolsUsed;

	public Designer(String name, String email, String address, String birthday, String designPhilosopgy,String designToolsUsed) {
		super(name, email, address, birthday);
		this.designPhilosopgy = designPhilosopgy;
		this.designToolsUsed = designToolsUsed;
	}
	@Override
	public void work() {
		System.out.println("This Employee work is to design	");
	}
	
}
