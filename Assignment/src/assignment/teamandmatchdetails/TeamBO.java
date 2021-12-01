package assignment.teamandmatchdetails;

public class TeamBO {
	
	public Team createTeam(String data, Player []playerList) 
	{
		// splitting the data and storing the data as name and playerDetails to return in a team object.
		String teamDetails [] = data.split("[,]",0);
		String name = teamDetails[0];
		String playerDetail = teamDetails[1];
		Team team = new Team();
		
		for(int i = 0;i<playerList.length;i++)
		{
			if(playerDetail.equalsIgnoreCase(playerList[i].getName()))
			{
				team= new Team(name,playerList[i]);
			}
		}
		
		return team;
	}
}
