package assignment.teamandmatchdetails;

public class Team {
	private String name;
	private Player Player;
	
	public Team() {
		 
	}
	
	public Team(String name, Player player) {
		super();
		this.name = name;
		Player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer() {
		return Player;
	}

	public void setPlayer(Player player) {
		Player = player;
	}
	
	

}
