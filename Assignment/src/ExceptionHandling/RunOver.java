package ExceptionHandling;

public class RunOver {
	
	private int totalRun;
	private int totalOverFaced;
	
	public RunOver()
	{
		
	}

	public RunOver(int totalRun, int totalOverFaced) {
		super();
		this.totalRun = totalRun;
		this.totalOverFaced = totalOverFaced;
	}

	public int getTotalRun() {
		return totalRun;
	}

	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}

	public int getTotalOverFaced() {
		return totalOverFaced;
	}

	public void setTotalOverFaced(int totalOverFaced) {
		this.totalOverFaced = totalOverFaced;
	}
	
}
