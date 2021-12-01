package com.assisgnment.HRM;

public class CTO  extends Architech{
	private String technologyDomains;

	public CTO(String name, String email, String address, String birthday, String programmingLanguage,String designMethodology, String technologyDomains) {
		super(name, email, address, birthday, programmingLanguage, designMethodology);
		this.technologyDomains = technologyDomains;
	}
	
	@Override
	public void work() {
		System.out.println("This employee is kind of programmer who advise technologies");
	}
	
}
