package util;

import customException.AccountHandlingException;

public class AccountValidations {

	public static final double MIN_BALANCE;
	
	static
	{
		MIN_BALANCE =1000;
	}
	
	public static double validateBalance(double balance)
	{
		if(balance < MIN_BALANCE)
		{
			throw new AccountHandlingException("Insufficient Balance.....!!!");
		}
		return balance;//return the validated balance
	}
}
