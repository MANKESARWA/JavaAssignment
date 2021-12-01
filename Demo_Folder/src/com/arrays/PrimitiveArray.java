package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveArray {
	public static void main(String args[])
	{
		// hard codded array.
		// array are the firstt class objects.
		double []data = {10,20,30};//data is ref of array of double values
		
		System.out.println("Array element : ");
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		
		//Array from the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array : ");
		double []data1 = new double[sc.nextInt()];//dynamic array creation
		
		
		//taking the element of the array.
		for(int i = 0; i<data1.length;i++)
		{
			System.out.println("Enter the Elements:");
			data1[i]=sc.nextDouble();
		}
		
		//Printing the element of array.
		for(int i=0; i<data1.length;i++) {
			
			System.out.println(data1[i]);
		}
		System.out.println("Class name : "+data1.getClass().getName());
		System.out.println(Arrays.toString(data1));
		
		
		System.out.println("Array using for each");
		for(double d:data1)//Generally used for the array whose length is not given //d = data[0],data[1],data[2],............
		{
			System.out.println(d);
		}
	}	
	
}
