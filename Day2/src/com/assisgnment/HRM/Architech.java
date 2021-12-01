package com.assisgnment.HRM;

public class Architech extends Programmer{
	private String designMethodology;

	public Architech(String name, String email, String address, String birthday, String programmingLanguage,String designMethodology) {
		super(name, email, address, birthday, programmingLanguage);
		this.designMethodology = designMethodology;
	}
	
	@Override
	public void work() {
		System.out.println("This employee is a kind of programmer who design system.");
	}
	
	
}
