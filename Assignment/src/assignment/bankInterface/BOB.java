package assignment.bankInterface;

public class BOB implements Bank{
	
	@Override
	public boolean createAccount(int accNo,String custName, double initBalance)
	{
		if(initBalance >= 1000)
		{
			System.out.println("Account created for "+custName+" with account number "+accNo+" and available balance as "+initBalance);
		}
		System.out.println("Account creation failed");
		return false;
	}
	
	@Override
	public void withdraw(int accNo,double amount)
	{
		System.out.println("Withdrawl from BOB account number "+accNo+"amount "+amount);
	}
	
	
	
}
