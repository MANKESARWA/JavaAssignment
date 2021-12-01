package com.assisgnment;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		int i,num;
		long fact=1;
		System.out.println("Enter the number whose factorial you want: ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		sc.close();
		if(num == 0)
		{
			System.out.println("The Factorial of 0 is "+fact);
		}
		else
		{
			for(i = 1;i<=num;i++) 
			{
				fact = fact*i;
			}
			System.out.println("The factorial of "+num+" is "+fact);
		}
		sc.close();
	}
}
