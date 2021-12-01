package com.basic;

public class SwitchDemo {
	public static void main(String[] args)
	{
		System.out.println("1.English");
		System.out.println("2.Marathi");
		System.out.println("3.Hindi");
		System.out.println("4.Telgu");
		
		int choice = 2;
		
		switch(choice)
		{
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Marathi");
			break;
		case 3:
			System.out.println("You selected Hindi");
			break;
		case 4:
			System.out.println("You selected Telgu");
			break;
		default:
			System.out.println("You selected wrong option");	
			break;	
		}
	}
}
