package assignment.teamandmatchdetails;

public class MatchBO {

	public Match createMatch(String data, Team[] teamList) 
	{
		String []matchDetails = data.split(",",0);
		String date  = matchDetails[0];
		String venue = matchDetails[1];
		String teamOne = matchDetails[2];
		String teamTwo = matchDetails[3];
		Match match = new Match();
		for(int i = 0;i<teamList.length-1;i++)
		{
			if((teamOne.equalsIgnoreCase(teamList[i].getName()))&& (teamTwo.equalsIgnoreCase(teamList[i+1].getName())))
			{
				match = new Match(date, venue, teamList[i], teamList[i+1]);
			}
		}
		
		
		return match;
	}
	
	public Team findTeam(String matchDate,Match[] matchList) {
		Team teamOne,teamTwo;
		for(int i=0;i<matchList.length;i++) {
			if(matchDate.equalsIgnoreCase(matchList[i].getDate()))
			{
				teamOne = matchList[i].getTeamone();
				teamTwo = matchList[i].getTeamtwo();
				
				String teamone = teamOne.getName();
				String teamtwo = teamTwo.getName();
				
				System.out.println(teamone+", "+teamtwo);				
			}
		}
		return null;
	}
	
	public void findAllMatchesOfTeam(String teamName,Match[] matchList) {
		
		for(int i = 0;i< matchList.length;i++)
		{
			Team team1 = matchList[i].getTeamone();
			Team team2 = matchList[i].getTeamtwo();
			if( (teamName.equalsIgnoreCase(team1.getName())) || (teamName.equalsIgnoreCase(team2.getName())) )
			{
				System.out.println("Date  TeamOne  TeamTwo  Venue");
				System.out.println(matchList[i].getDate()+"  "+ matchList[i].getVenue()+"  "+team1.getName()+"  "+team2.getName());
			}
		}
		
	}
}
