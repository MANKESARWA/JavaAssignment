package com.Assign16;
import java.util.Scanner;

public class PlayerTestApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Player p = new Player();
		Skills sk = new Skills();
		PlayerBO pbo = new PlayerBO();
		
		
		int i,num;
		System.out.println("Enter number of Players");
		num = sc.nextInt();
		Player []playerList = new Player[num];
		for(i = 0;i<num;i++)
		{
			System.out.println("Enter player "+(i+1)+" details: ");
			System.out.println("Enter player name");
			p.setName(sc.next());
			System.out.println("Enter country name");
			p.setCountry(sc.next());
			System.out.println("Enter skill");
			p.setSkill(sc.next());
			playerList[i] = new Player(p.getName(), p.getCountry(), p.getSkill());
		}
		boolean exit = false;
		while(!exit) {
			System.out.println("Menu:");
			System.out.println("1.View details");
			System.out.println("2.Filter players with skill");
			System.out.println("3.Exit");
			int opt= sc.nextInt();
			switch (opt) {
				case 1: 
					pbo.viewDetails(playerList);
					break;
				case 2:
					System.out.println("Enter skill");
					sk.setSkillName(sc.next());
					pbo.printPlayerDetailsWithSkill(playerList, sk.getSkillName());
					break;
				case 3: 
					exit = true;
					break;
			}
			
		}
		sc.close();
	}
	
}
