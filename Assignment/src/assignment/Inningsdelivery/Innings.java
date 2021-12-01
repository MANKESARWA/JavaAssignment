package assignment.Inningsdelivery;

public class Innings {
	private long inningsNumber;
	private String battingTeam;
	
	public Innings(){}
	
	public Innings(long inningsNumber, String battingTeam) {
		super();
		this.inningsNumber = inningsNumber;
		this.battingTeam = battingTeam;
	}

	public long getInningsNumber() {
		return inningsNumber;
	}

	public void setInningsNumber(long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	
	
}
