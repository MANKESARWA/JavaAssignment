package com.inheritence;

public class Orange extends Fruit{
	
	private String orangeName;

	public Orange(String name, String orangeName) {
		super(name);
		this.orangeName = orangeName;
	}
	
	@Override
	public void toTaste() {
		System.out.println("Oranges are tange in taste....");
	}
	
}
