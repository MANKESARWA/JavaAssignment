package assignment.bankInterface;

public class HDFC implements Bank{
	
	@Override
	public boolean createAccount(int accNo,String custName, double initBalance)
	{
		if(initBalance >= 5000)
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
	
	public void payBills(int accNo) {
		System.out.println("Paying bill through HDFC account"+accNo);
	}
}
