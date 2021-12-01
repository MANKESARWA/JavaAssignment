package com.abstarct;

public abstract class Instrument {
	
	abstract void play();// can be overriden by child
	
	final void show()// already defined in its final form cannot be overridden by its child 
	{ 
		System.out.println("In final show");
	}

	public static void MyTest()
	{
		
	}
	
}
