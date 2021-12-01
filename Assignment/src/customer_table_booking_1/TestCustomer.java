package customer_table_booking_1;
import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CustomerBO customerbo =  new CustomerBO();
		for(int i = 0;i<2;i++)
		{
			System.out.println("Enter the details of Customer "+(i+1));
			customerbo.settingValue(sc.nextLine());
		}
		
		customerbo.displayCustomer();
		
		
	}
}
