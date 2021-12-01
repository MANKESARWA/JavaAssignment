package com.point;
import java.lang.Math;

public class Point2D 
{
	private int x,y;
	
	//Defining the parameterized constructor
	public Point2D(int x,int y) {
		this.x= x;
		this.y=y;
	}
	
	//Defining the display method
	public String getDetails()
	{
	   return "Point("+x+","+y+")";
	}
	
	public boolean isEqual(Point2D p)
	{
		return (this.x==p.x &&this.y==p.y);
	}	
	
	
	public Point2D createNewPoint(int xoff,int yoff)
	{
		return new Point2D(this.x+xoff,this.y+yoff);
	}
	
	public double calcDistance(Point2D p)
	{
		double res;
		res = Math.abs((this.x*p.x)+(this.y*p.y));
		return res;
	}
	
}
