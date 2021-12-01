package assignment.MatchOutcome;
import java.util.Scanner;

public class TestMatchOutcome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of matches");
		int matchNumbers = sc.nextInt();
		Match match = new Match();
		Outcome outcome = new Outcome();
		Match matchList[] = new Match[matchNumbers];
		for(int i= 0; i<matchNumbers;i++)
		{
			System.out.println("Enter match "+(i+1)+" details: ");
			
			System.out.println("Enter match date");
			match.setDate(sc.next());
			System.out.println("Enter team one");
			match.setTeamOne(sc.next());
			System.out.println("Enter team two");
			match.setTeamTwo(sc.next());
			System.out.println("Enter venue");
			match.setVenue(sc.next());
			System.out.println("Enter status");
			outcome.setStatus(sc.next());
			System.out.println("Enter winner Team");
			outcome.setWinnerTeam(sc.next());
			match.setOutcome(new Outcome(outcome.getStatus(),outcome.getWinnerTeam()));
			
			matchList[i] = new Match(match.getDate(), match.getTeamOne(), match.getTeamTwo(), match.getVenue(),match.getOutcome());		
		}
		
		MatchBO matchbo = new MatchBO();
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("Match Details");
					matchbo.printAllMatchDetails(matchList);
					break;
				case 2:
					System.out.println("Enter outcome status");
					String outcomeStatus = sc.next();
					matchbo.printMatchDetailsWithOutcomeStatus(matchList, outcomeStatus);
					break;
				case 3:
					System.out.println("Enter outcome winner team");
					String outcomeWinnerTeam = sc.next();
					matchbo.printMatchDetailsWithOutcomeWinnerTeam(matchList, outcomeWinnerTeam);
					break;
				case 4:
					exit = true;
					break;
			}
		}
		

		sc.close();
	}
}
