package assignment.bankInterface;

public interface Bank {
	
	public abstract boolean createAccount(int accNo,String custName, double initBalance);
	public abstract void withdraw(int accNo,double amount);

}
