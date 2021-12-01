package CustomException;

public class RunBO {
	
	Run run = new Run();
	
	public String runRate(int totalRun ,int totalOverFaced)
	{
		float runRate = (float)totalRun/totalOverFaced;
		return "Current Run Rate: "+String.format("%.2f", runRate);
	}
	

}
