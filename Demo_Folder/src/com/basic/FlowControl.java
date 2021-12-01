package com.basic;

public class FlowControl {
	public static void main() 
	{
		int a = 2,b = 3,c = 4;
		
		//using conditional operator
		int max =(a>b)?a:b;
		System.out.println(max+" is greater");
		
		// using if else operation
		if(a>b && a>c)
		{
			System.out.println(a+" is the greater");;
		}
		else if(b>c && b>a)
		{
			System.out.println(b+" is the greater");
		}
		else
		{
			System.out.println(c+" is the greater");
		}
	}
	
}
