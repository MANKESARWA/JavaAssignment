package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesterExceptionHandling extends Exception{
	
	public static void main(String[] args) throws IOException {
		RunOver runOver = new RunOver();		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(r);
		BufferedReader br2 = new BufferedReader(r);
		
		try
		{
			System.out.println("Enter the total runs scored");
			runOver.setTotalRun(Integer.parseInt(br1.readLine()));
			System.out.println("Enter the total overs faced");
			runOver.setTotalOverFaced(Integer.parseInt(br2.readLine()));
			float runRate;
			if(runOver.getTotalOverFaced()==0)
				runRate = runOver.getTotalRun()/runOver.getTotalOverFaced();
			
			 runRate= (float)runOver.getTotalRun()/runOver.getTotalOverFaced();//check my exception
			System.out.println("Current Run Rate: "+String.format("%.2f", runRate));
		}
		catch(ArithmeticException | NumberFormatException e)
		{
			System.out.println(e.getClass().toString().substring(6));
		}
	}
	
	
	

}
