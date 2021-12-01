package assignment.Inningsdelivery;

public class InningsBO {
	
	public Innings createInninngs(String data)
	{
		Innings innings = new Innings();
		String inningsData[] = data.split("[,]",0);
		innings.setInningsNumber(Long.parseLong(inningsData[0]));//converting String to long integer by parsing method 
		innings.setBattingTeam(inningsData[1]);		
		Innings inningsList = new Innings(innings.getInningsNumber(),innings.getBattingTeam());		
		return inningsList;
	}

}
