package com.Assign16;

public class PlayerBO {
	
	Player p = new Player();
	Skills s = new Skills();
	
	public PlayerBO() {
		
	}

	public void viewDetails(Player []playerList)
	{
		System.out.println("Player  Country   Skill");
		for(Player p:playerList) {
			
			if(p!= null) {
				System.out.println(p.toString());
			}
		}
	}
	
	public void printPlayerDetailsWithSkill(Player []playerList,String skill) {
		int count = 0;
		System.out.println("Player  Country   Skill");
		for(int i=0;i<playerList.length;i++)
		   {
			   if(skill.equalsIgnoreCase(playerList[i].getSkill())) {
				   count++;
				   System.out.println(playerList[i].getName()+"\t"+playerList[i].getCountry()+"\t"+playerList[i].getSkill());
			   }
		   }
		if(count==0) {
			System.out.println("Skill not found");
		}
	}
	
}
