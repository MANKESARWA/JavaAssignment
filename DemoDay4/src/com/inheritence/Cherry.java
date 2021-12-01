package com.inheritence;

public class Cherry extends Fruit {
	
	private String cherryName;

	public Cherry(String name, String cherryName) {
		super(name);
		this.cherryName = cherryName;
	}
	
	public void toTaste() {
		System.out.println("The cherrys are sweet.........");
	}
	
}
