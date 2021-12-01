package FruitBasket;
import java.util.Scanner;

public class FruitBasketTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Menu \n1. Add Apple\n2. Add Orange\n3. Add Cherry\n4. Display taste of all fruits in the basket.\n5. Call child specfic functionality using instance of checking.\n6. Exit");
		
		Fruits basket = new Fruits();
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			sc.nextLine();
			switch(ch) 
			{	
			case 1:
				System.out.println("Enter apple name");
				basket.setName(sc.nextLine());
				break;
			case 2:
				basket.setName(sc.nextLine());
				break;
			case 3:
				basket.setName(sc.nextLine());
				break;
			case 4:
				((Apple)basket).taste();
				((Orange)basket).taste();
				((Cherry)basket).taste();
			case 5:
				
				break;
			case 6:
				exit = true;
				break;
			}
		}
		
		sc.close();
	}
	
}
