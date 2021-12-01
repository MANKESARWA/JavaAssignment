package assignment.MatchOutcome;

public class MatchBO {
	
	public void printAllMatchDetails(Match[] matchList)
	{
		for(int i= 0;i<matchList.length;i++)
		{
			System.out.println("Match Details");

//			System.out.println(String.format("%-5s %-5s %-5s %-5s %-10s", "Date,Team1,Team2,Venue,Status,Winner"));
			System.out.println(matchList[i].toString());;
		}
	}
	
	public void printMatchDetailsWithOutcomeStatus(Match []matchList,String outcomeStatus)
	{
		
		for(int i = 0 ; i<matchList.length;i++)
		{
			if((matchList[i].getOutcome().getStatus()).equalsIgnoreCase(outcomeStatus))
			{
				
				System.out.println(matchList[i].toString());
				
			} 
		}
		
	}
	
	public void printMatchDetailsWithOutcomeWinnerTeam(Match[] matchList, String outcomeWinnerTeam)
	{
		for(int i = 0;i<matchList.length;i++)
		{
			if((matchList[i].getOutcome().getWinnerTeam()).equalsIgnoreCase(outcomeWinnerTeam))
			{
				System.out.println(matchList[i].toString());				
			}
		}
	}

}
