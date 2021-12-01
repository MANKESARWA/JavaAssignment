package assignment.teamandmatchdetails;

public class Match {
	private String date,venue;
	private Team teamone,teamtwo,team;
	
	public Match() {
		
	}
	
	public Match(String date, String venue, Team teamone, Team teamtwo) 
	{
		super();
		this.date = date;
		this.venue = venue;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Team getTeamone() {
		return teamone;
	}

	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}

	public Team getTeamtwo() {
		return teamtwo;
	}

	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%s",date,venue,teamone,teamtwo,team);
	}
	
	
	

}
