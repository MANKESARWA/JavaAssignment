package assignment.Inningsdelivery;
import java.util.Scanner;

public class TesterInning {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input of the innings.
		System.out.println("Enter the number of innings");
		int inningsCount = sc.nextInt();
		Innings []inningsList = new Innings[inningsCount];
		InningsBO inningsbo = new InningsBO();
		
		for(int i = 0;i<inningsCount;i++)
		{
			System.out.println("Enter innings "+(i+1)+" details");
			String innings = sc.next();
			inningsList[i]=inningsbo.createInninngs(innings);
		}
		//taking input of deliveries.
		System.out.println("Enter the number of deliveries");
		int deliveryCount= sc.nextInt();
		Delivery deliveryList[] = new Delivery[deliveryCount];
		DeliveryBO deliverybo = new DeliveryBO();
		for(int i=0;i<deliveryCount;i++)
		{
			System.out.println("Enter innings "+(i+1)+" details");
			String deliveryDetails = sc.next();
			deliveryList[i]=deliverybo.createDelivery(deliveryDetails, inningsList);
		}
		
		
		//Displaying the inning number
		System.out.println("Enter the delivery number for which you need to find the innings number");
		long deliveryNumber = sc.nextLong();
		deliverybo.findInninngNumber(deliveryList, deliveryNumber);
		
		sc.close();
	}

}
