package com.basic;

public class Factorial {
 public static void main()
 {
	 int num = 5,fact =1,i;
	 for(i = 1; i<=num;i++)
	 {
		 fact = fact * i;				
	 }
	 System.out.println("factorial of"+ num+ " is "+fact);
 }
}
