package assignment.bankInterface;
import java.util.Scanner;

public class TesterBank {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you bank name ");
		String bankName=sc.nextLine();
//		System.out.println(bankName);
		boolean exit = false;
		Bank []bank =  {new BOB(),new HDFC()};
		BOB bob = new BOB();
		HDFC hdfc = new HDFC();
		while(!exit) 
		{
			System.out.println("Menu: ");
			System.out.println("1. Create Account");
			System.out.println("2. Money withdraw");
			System.out.println("3. Pay Bills");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice");
			int opt = sc.nextInt();
			sc.nextLine();
			switch(opt) {
			case 1:
				System.out.println("Enter your name ");
				String name = sc.next();
				System.out.println("Enter your account number");
				int accNo = sc.nextInt();
				System.out.println("Enter your balance");
				double initBalance =  sc.nextDouble();
				System.out.println(bankName);
				if(bankName.equalsIgnoreCase("BOB"))
				{
					bob.createAccount(accNo, name, initBalance);
				}
				else if(bankName.equals("HDFC"))
				{
					hdfc.createAccount(accNo, name, initBalance);
				}
				break;
			case 2:
				if(bankName.equalsIgnoreCase("BOB"))
				{
					System.out.println("Enter account number");
					accNo = sc.nextInt();
					System.out.println("Enter amount to withdrawl");
					double amount = sc.nextInt();
					bob.withdraw(accNo, amount);
				}
				else if(bankName.equals("HDFC"))
				{
					System.out.println("Enter account number");
					accNo = sc.nextInt();
					System.out.println("Enter amount to withdrawl");
					double amount = sc.nextInt();
					hdfc.withdraw(accNo, amount);
				}
				break;
			case 3:
				System.out.println("Enter account number");
				accNo = sc.nextInt();
				hdfc.payBills(accNo);
				break;
			case 4:
				exit = false;
				break;
			}
		}
		
		sc.close();
	}
}
