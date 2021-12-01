package com.basic;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		float m = 0.0f;
		
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		
		System.out.println("Enter the value of m: ");
		
		if(sc.hasNextFloat())//to check that a particular value has be given or not. 
		{
			m = sc.nextFloat();
		}
		System.out.println("Sum = "+(a+b));
		 
		System.out.println("m = "+m);
	}
}
