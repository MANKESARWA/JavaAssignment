package com.assisgnment;
import java.util.Scanner;

public class NumberTOWord {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		int num = sc.nextInt();
		ValuetoWords vtw = new ValuetoWords();
		if(num <0 ||num >=9999) {
			System.out.println("Given number out of range.");
		}
		else {
			System.out.println("Output: "+vtw.converter(num));
		}
		sc.close();
		
	}

}
