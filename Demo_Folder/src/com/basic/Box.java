package com.basic;

public class Box {
	// data member 
	private int len,wid,hgt;
	private static int count = 0;
	
	//data behaviour
	
	// accessifire returntype methodName(arg list[]){}
	public void showDim()
	{
		System.out.println("Box dimension : "+len+", "+wid+", "+hgt);
	}
	//Constructor accessifire contructorName
	public Box() {
		len = 10;
		wid = 10;
		hgt = 10;
	}
	
	public Box(int l,int w,int h) {
		len = l;
		wid = w;
		hgt = h;
	}
	
	
	//Getter function :  will be value returning method.
	public int getLen() {
		return len;
	}
	
	public int getWidth() {
		return wid;
	}
	public int getHeight() {
		return hgt;
	}
	// Setter function  : will allow you to change the value.
	
	public void setLen(int l) {
		len = l;
	}
	
	public void setWid(int w) {
		wid = w;
	}
	
	public void setHgt(int h) {
		hgt = h;
	}
	
	// method with box ref as parameter.
	public boolean isEqual(Box b)
	{
		return this.len==b.len && this.wid==b.wid && this.hgt==b.hgt;
		
	}
	
	// create new box obj and adding the offset.
	public Box createNewBox(int loff,int woff,int hoff)
	{
		return new Box(this.len +loff,this.wid+woff,this.hgt+hoff);
	}
	
}
