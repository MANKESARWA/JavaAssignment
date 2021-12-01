package CustomException;
import java.util.Scanner;


public class TestCustomException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Run run = new Run();
		RuleOfException rule = new RuleOfException();
		RunBO runbo = new RunBO();
		try {
		System.out.println("Enter the total runs scored");
		run.setTotalRun(sc.nextInt());
		System.out.println("Enter the total overs faced");
		run.setTotalOversFaced(sc.nextInt());
		rule.validationOver(run.getTotalOversFaced());
		System.out.println(runbo.runRate(run.getTotalRun(),run.getTotalOversFaced()));
		}
		catch (OverRangeException e) {
			System.out.println(e.getMessage());
		}

	}

}
