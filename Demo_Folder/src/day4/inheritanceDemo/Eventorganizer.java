package day4.inheritanceDemo;
import java.util.Scanner;

public class Eventorganizer {

	//Event org app :  need to store multiple participant data : both student as well faculty
	// Menu 1. Register Student 2.Register Faulty 3.Display all participant 4.Exit
	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of participant for a event: ");
		person [] part;
		
		boolean exit = false;
		int count = 0;
		part = new person[sc.nextInt()];
		while(!exit) {
			System.out.println("1. Register Student");
			System.out.println("2. Register Faculty");
			System.out.println("3. Display all participant");
			System.out.println("4. Exit");
			System.out.println("Enter your choice :");
			
			switch(sc.nextInt())
			{
				case 1: // register student and check the boundary condition
					if(count<=part.length)
					{
						System.out.println("Enter Student details :");
						part[count]=new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
						count++;
					}
					else
					{
						System.out.println("The event is full........");
					}
					break;
				case 2: //register faculty
					if(count<=part.length)
					{
						System.out.println("Enter Faculty details :");
						part[count]=new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
						count++;
					}
					else
					{
						System.out.println("The event is full........");
					}
					break;
				case 3: //displaying the details.
					for (person p :part) {
						if(p!=null)
						System.out.println(p); //it will call p.toString();
					}
					break;
				case 4: //Exiting the menu.
					exit = true;
					break;
					
			}
		
			
			
			
		}
		sc.close();
		
	}

}
