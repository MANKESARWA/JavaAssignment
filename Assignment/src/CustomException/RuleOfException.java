package CustomException;

public class RuleOfException {
	
	public static final int FIRST_OVER;
	public static final int LAST_OVER;
	
	public RuleOfException(){
		
	}
	
	Run run = new Run();
	//Adding boundaries of the over
	static
	{
		FIRST_OVER = 0;
		LAST_OVER = 20;
	}
	//Applying the validation rule for my custom exception.
	public static void validationOver(int totalOver) throws OverRangeException {

		if (totalOver < FIRST_OVER) {
			throw new OverRangeException("OverRangeException: Over is not in the specified range");
		}
		if (totalOver > LAST_OVER) {
			throw new OverRangeException("OverRangeException: Over is not in the specified range");
		}

	}
	
}
