
package com.assisgnment;
import java.lang.Math;		

public class AreaOfTriangle {
	public static void main(String args[])
	{
		double [] x_co = {10,10,80};
		double [] y_co = {20,60,20};
		double area;
		area = Math.abs((x_co[0]*(y_co[1] - y_co[2])+x_co[1]*(y_co[2]-y_co[0])+x_co[2]*(y_co[0]-y_co[1]))/2);
		System.out.println(area);
	}
}
