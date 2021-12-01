package assignment.teamandmatchdetails;

public class PlayerBO {
	
	public Player createPlayer(String data) {
		String []dataList= data.split("[,]",0);
		String  name = dataList[0];
		String Country = dataList[1];
		String Skill = dataList[2];
		
		Player player = new Player(name, Country, Skill);
		
		return player;

	}
}
