package tester;

import java.util.Scanner;

public class TestUncheckedException {

	public static void main(String[] args) {
		try
		{
			//int []data = {1,2,3,4,5,6};
			//java compiler does not forces the handling of unchecked Exception
//			System.out.println(data[7]);//JVM is throwing new ArrayIndexOutOfBoundsException
			
			String s = "1234";
			System.out.println("Parsed Integer : "+Integer.parseInt(s));
			Scanner sc = null;
			System.out.println("Enter a number");
			System.out.println(sc.nextInt());
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e)//if we have multiple catch  with same functionality we use pipe catch.
		{
			System.out.println("Error: "+e);
		}
//		catch(NullPointerException e) {
//			System.out.println("Error: "+e);
//		}
		//catch all block
		catch(Exception e) {
			System.out.println("Catch all Error: "+e);
		}
		
		
		System.out.println("Main Continued...");
	}

}
