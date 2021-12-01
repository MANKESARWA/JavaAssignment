package com.inheritence;

public class Apple extends Fruit {
	
	private String appleName;
	
	
	public Apple(String name, String appleName) {
		super(name);
		this.appleName = appleName;
	}

	@Override
	public void toTaste() {
		System.out.println("Apples are sweet");
	}
}
