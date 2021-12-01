package java8newfeature;

public interface B {
	
	int DATA =23;//public static final
	void fun2();//public abstract
	
	 default void show()
	{
		System.out.println("In show");
	}
}
