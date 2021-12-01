package lamba;

public class Utils {
	//this class will hold the higher order function : which has one of the parameter as functional interface type reference
	
	public static double testCompute(double n1, double n2, Computable ref/* this computable is a higer order function */)
	{
		return ref.compute(n1, n2);
	}
}
