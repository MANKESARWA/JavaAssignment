package FruitClass;

public class TestTaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Apple("Apple","Kashmari");
//		f = new Orange("Orange","Kashmari");
//		f = new cherry("Cherry","Kashmari");
		f.taste();
		//f.createJam(); //,compile time error : javac goes by compile time type of invoke.
		((Apple)f).createJam();// parent refernce calling chile specific functinallity : javac error.
	}

}
