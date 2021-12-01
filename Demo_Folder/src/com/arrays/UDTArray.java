package com.arrays;
import com.basic.Box;
import java.util.Scanner;

public class UDTArray {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Box to stored in array");
		
		int num = sc.nextInt() ;
		Box [] boxes = new Box[num];//reference of box type array
		System.out.println("Array class name : "+boxes.getClass().getName());
		System.out.println("length: "+boxes.length);
		for(int i = 0; i< boxes.length;i++)
		{
			System.out.println("Enter len, wid, height");
			boxes[i] = new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		for(Box b:boxes)
		{
			b.showDim();
		}
	}
}
