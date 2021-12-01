package com.basic;

public class TextBoxApplication {
	public static void main(String[] args)
	{
//		int a1=1;// primitive type variable : store the value of the variable and create  a memory space.
		Box b1 = new Box();//calling the constructor from basic package for box class //reference type variable : store the address.
		b1.showDim();
		
		
		Box b2 = new Box(11,22,33);
		b2.showDim();
		
		System.out.println("Length of box is : "+b2.getLen());
		System.out.println("Width of box is : "+b2.getWidth());
		System.out.println("Height of box is : "+b2.getHeight());
		
		b2.setWid(20);
		b2.showDim();
	}
}
