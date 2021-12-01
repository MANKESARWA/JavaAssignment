package com.basic;

public class BreakContinueDemo {
	public static void main(String args[])
	{
		
		//Demo of break statement;
		int i;
		for(i = 1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println("i : "+i);
		}
		System.out.println("Out of loop body");
		
		
		//Demo of continue statement;
		
		int j;
		for(j = 1;j<=10;j++)
		{	
			if(j==5)
			{
				continue;
			}
			System.out.println("j : "+j);
		}
		System.out.println("Out of loop body");
	}
}
