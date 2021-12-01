package com.basic;

public class LoopDemo {
	public static void main(String args[])
	{
		//print hello 10 time on console using while loop.
		
		int count = 1; //initial value of loop variable
		while(count<=10)//2. termination condition (where to stop)
		{
			System.out.println("hello : "+count);
			count++;//updating condition
		}
		System.out.println("Out of the loop");
		
		
		
		
		//print hello 10 time on console using for loop.

		for(count = 1/*initial value of loop variable*/ ; count<=10 /*2. termination condition (where to stop)*/ ; count++ /*updating condition*/)
		{
			System.out.println("hello : "+count);
		}
		System.out.println("Out of the loop");
		
		
		
		
		//print hello 10 time on console using do.. While loop.
		
//		int count = 1; //initial value of loop variable
		do
		{
			System.out.println("hello : "+count);
			count++;//updating condition
		}while(count<=10);//termination condition (where to stop)
		System.out.println("Out of the loop");
	}
	
}
