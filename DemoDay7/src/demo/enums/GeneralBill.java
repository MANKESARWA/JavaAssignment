package demo.enums;
import java.util.Scanner;

public class GeneralBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int bill = 0;
		Menu m1 = Menu.NOODLES;
		
		while(!exit) {
			try {
				System.out.println("Menu:");
				for(Menu m : Menu.values())
				{
					System.out.println(m);
				}
				System.out.println("Please enter food item n quantity.");
				Menu m = Menu.valueOf(sc.next().toUpperCase());
				int qty = sc.nextInt();
				switch(m)
				{
				case SOUP:
				case RICE:
				case NOODLES:
					bill+=(qty*m.getPrice());
					break;
				}
			}
			catch(IllegalArgumentException e) {
				System.out.println("Generating Bill");
				exit = true;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total bill"+bill);
			if(sc!=null) {
				sc.close();
			}
			
		}
		
	}

}
