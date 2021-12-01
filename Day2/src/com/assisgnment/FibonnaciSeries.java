package com.assisgnment;
import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String args[])
	{
		int num,a=0,b=1,i,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
		System.out.print(a+" "+b);
		sc.close();
		for(i=2;i<num;i++) 
		{
			temp=a+b;
			if(temp<num) 
			{
				System.out.print(" "+temp);
				a=b;
				b=temp;
			}
		}
		sc.close();
	}
}
