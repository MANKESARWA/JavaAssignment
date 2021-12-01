package CustomException;

public class Run {
	
	private int totalRun;
	private int totalOversFaced;
	
	public Run(int totalRun, int totalOversFaced) {
		super();
		this.totalRun = totalRun;
		this.totalOversFaced = totalOversFaced;
	}
	public Run() {
		
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getTotalOversFaced() {
		return totalOversFaced;
	}
	public void setTotalOversFaced(int totalOversFaced) {
		this.totalOversFaced = totalOversFaced;
	}
	
}
