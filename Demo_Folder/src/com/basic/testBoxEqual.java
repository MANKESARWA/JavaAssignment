package com.basic;

public class testBoxEqual {
	public static void main(String args[])
	{
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(11,22,33);
		System.out.println(b1.isEqual(b2));
		b1.showDim();
		
		Box b3 =  b1.createNewBox(2, 3, 4);
		b3.showDim();
		
	}
	
}
