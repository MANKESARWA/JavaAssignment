package assignment.teamandmatchdetails;
import java.util.Scanner;

public class TournamentTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Working with player
		
		System.out.println("Enter the player count");
		int playerCount = sc.nextInt();
		Player PlayerList[] = new Player[playerCount];
		PlayerBO playerbo = new PlayerBO();
		for(int i = 0;i<playerCount;i++)
		{
			System.out.println("Enter Player "+(i+1)+" details");
			String playerData = sc.next();// getting the player details from user 
			PlayerList[i]=playerbo.createPlayer(playerData); //setting player details 
		}
		
		//Working with Team 
		
		System.out.println("Enter the team count");
		int teamCount = sc.nextInt();
		Team teamList[] = new Team[teamCount];
		TeamBO teambo = new TeamBO();
		for(int i = 0; i<teamCount;i++) {
			System.out.println("Enter Team "+(i+1)+" details");
			String teamData = sc.next();// getting the team details from user 
			teamList[i]= teambo.createTeam(teamData, PlayerList);//setting team details 
		}
		
		
		//Working with Match
		
		System.out.println("Enter the match count");
		int matchCount = sc.nextInt();
		Match matchList[] = new Match[matchCount];
		MatchBO matchbo = new MatchBO();
		for(int i = 0; i<matchCount;i++) {
			System.out.println("Enter match "+(i+1)+" details");
			String matchData = sc.next();// getting the match details from user 
			matchList[i]= matchbo.createMatch(matchData, teamList); //setting match details
		}
		
		
		//Making a menu for the user.
		boolean exit = true;
		while(!exit)
		{
			System.out.println("Menu :");
			System.out.println("1)Find Team");
			System.out.println("2) Find all Matches In a specific Venue");
			System.out.println("Type 1 or 2");
			System.out.println("Enter your choice");
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.println("Enter Match date");
					String date = sc.next();
					System.out.println("Team");
					matchbo.findTeam(date, matchList);
					break;
				case 2:
					System.out.println("Match Details: ");
					System.out.println("Enter team name");
					String teamName = sc.next();
					matchbo.findAllMatchesOfTeam(teamName, matchList);
					System.out.println("do you want to continue? Type Yes or No");
					break;
			}
			System.out.println("do you want to continue? Type Yes or No");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("Yes"))
			{
				continue;
			}
			else
			{
				exit = false;
			}
			
		}
		sc.close();	// closing the  scanner 
	}

}
