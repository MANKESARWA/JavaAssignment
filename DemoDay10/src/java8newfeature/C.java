package java8newfeature;

public class C implements A,B{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fun2() {
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
	}
	
	
	void display() {
		System.out.println("own Display");
	}
}
