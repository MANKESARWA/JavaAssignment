package com.assisgnment;
import java.util.Scanner;

public class MoneyManagement {
	public static void main(String args[]) {
		
		float sal;
		System.out.println("Enter your monthly Salary : ");
		Scanner sc = new Scanner(System.in);
		
		sal = sc.nextFloat();
		sc.close();
		System.out.println("Your Salary is "+sal);
		 
		
		System.out.println("NEC="+(int)(0.55f * sal));
		System.out.println("FFA="+(int)(0.1f * sal));
		System.out.println("EDU="+(int)(0.1f * sal));
		System.out.println("LTSS="+(int)(0.1f * sal));
		System.out.println("PLAY="+(int)(0.1f * sal));
		System.out.println("Give="+(int)(0.05f * sal));
		
		
	}

}
