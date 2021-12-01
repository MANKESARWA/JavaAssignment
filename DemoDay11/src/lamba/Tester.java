package lamba;

public class Tester {

	public static void main(String[] args) {
		
		//consume the higher order function
		
		double ref = Utils.testCompute(10, 20, new Computable() {
			
			@Override
			public double compute(double a, double b) {
						
				return a+b;
			}
		});
		System.out.println(ref);
		
		
		// if higher order function : parameter of function Interface type reference : can be substitued by lambda expression
		//lambda expression : anno function
		
		//double compute(double a,double b)
		 
		System.out.println(Utils.testCompute(10, 30, (a,b)->a*b));
	}

}
