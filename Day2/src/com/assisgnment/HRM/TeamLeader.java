package com.assisgnment.HRM;

public class TeamLeader extends Employee{
	private String teamCollaborationTools,developmentMethods;

		
	public TeamLeader(String name, String email, String address, String birthday, String teamCollaborationTools, String developmentMethods) {
		super(name, email, address, birthday);
		this.teamCollaborationTools = teamCollaborationTools;
		this.developmentMethods = developmentMethods;
	}

	@Override
	public void work() {
		System.out.println("The employe work is to schedule,organize,manage programmers,designers and testers.");
	}
}
