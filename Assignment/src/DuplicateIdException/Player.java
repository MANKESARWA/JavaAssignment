package DuplicateIdException;

public class Player {
		
	private String teamName;
	private String playerName;
	private int playerId;
	public Player(String teamName, String playerName, int playerId) {
		super();
		this.teamName = teamName;
		this.playerName = playerName;
		this.playerId = playerId;
	}
	public Player() {
		super();
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	
}
