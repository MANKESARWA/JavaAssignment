package java8newfeature;

public interface A {
	
	int DATA =23;//public static final
	void fun1();//public abstract
	
	 default void show()
	{
		System.out.println("In show");
	}
	 static void display()
	 {
		 System.out.println("In Static display of A");
	 }
}
