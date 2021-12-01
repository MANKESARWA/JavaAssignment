package customException;

public class AccountHandlingException extends Exception {

	public AccountHandlingException(String message)
	{
		this.message = message;
	}
	
}
