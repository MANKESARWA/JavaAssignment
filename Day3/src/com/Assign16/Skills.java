package com.Assign16;

public class Skills {
	private String skillName;
	Player p = new Player();
	

	public Skills(String skillName) {	
		this.skillName = skillName;
	}


	public Skills() {
		
	}
	
	
	
	public String getSkillName() {
		return skillName;
	}


	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	@Override
	public String toString() {
		return  p +"  " +skillName  ;
	}
	
	
	
}
