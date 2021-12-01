package com.point;
import java.util.*; // use this package to invoke the Scanner class.


public class TestPoint 
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Taking the value of point 1
		System.out.println("Enter the values of point 1 : "); 
		int p1x,p1y;
		p1x = sc.nextInt();
		p1y = sc.nextInt();
		Point2D pt = new Point2D(p1x,p1y);
		
		// Displaying point1
		System.out.println(pt.getDetails());
		
		//Taking the value of point 1
		System.out.println("Enter the values of Point 2 : "); 
		int p2x,p2y;
		p2x = sc.nextInt();
		p2y = sc.nextInt();
		Point2D pt1 = new Point2D(p2x,p2y); 
		
		//Displaying point2D
		System.out.println(pt1.getDetails());
		
		//Calling the equal method.
		System.out.println(pt.isEqual(pt1));
		
		Point2D pt2 = pt.createNewPoint(10, 20);
		System.out.println(pt2.getDetails());
		
		System.out.println("The distance between "+pt.getDetails()+" and "+pt1.getDetails()+" is "+pt.calcDistance(pt1));
		System.out.println("The distance between "+pt1.getDetails()+" and "+pt2.getDetails()+" is "+pt1.calcDistance(pt2));
		System.out.println("The distance between "+pt2.getDetails()+" and "+pt.getDetails()+" is "+pt2.calcDistance(pt));
		sc.close();

	}
}
