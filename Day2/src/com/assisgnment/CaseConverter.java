package com.assisgnment;

import java.util.Scanner;

public class CaseConverter {
	public static void main(String args[])
	{
		String strGiven,strTemp;
		System.out.println("Enter the string to convert : ");
		Scanner sc = new Scanner(System.in);
		strGiven = sc.nextLine();
		
		
		
		
		// for the program.
		System.out.println("For All Upper Case press 1.");
		System.out.println("For All Lower Case press 2.");
		System.out.println("For All Capitalize Case press 3.");
		System.out.println("For All Sentence case press 4.");
		System.out.println("For All Invert: case press 5.");
		
			
		System.out.println("Enter your Choice : ");
		int opt;
		opt = sc.nextInt();
		

		switch(opt)
		{
			case 1:
				System.out.println(strGiven.toLowerCase());
				break;
			case 2:
				System.out.println(strGiven.toUpperCase());
				break;
     		case 3:
				strTemp=strGiven;
				String [] words = strTemp.split(" ");
				for(String word:words) 
				{
					System.out.print(word.substring(0, 1).toUpperCase()+word.substring(1,word.length())+" "); 
				}
				break;
			case 4: 
				// concept not taught till now
			break;
			case 5 :
				char ch[] = strGiven.toCharArray();
				for(int i = 0 ;i<ch.length;i++)
				{
					ch[i]= Character.isUpperCase(ch[i])?Character.toLowerCase(ch[i]):Character.toUpperCase(ch[i]);
				}
				System.out.println(ch);
				break;
			default: 
				System.out.println("Please choose a valid option.");
				break;
		}
		sc.close();
	}
}
