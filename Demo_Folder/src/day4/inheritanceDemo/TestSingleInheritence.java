package day4.inheritanceDemo;

public class TestSingleInheritence {

	public static void main(String[] args) {
		
		
		Student s = new Student("Kiran","Bedi", 2002,67 , "MCA", 232424);
		System.out.println(s); // it will call to string function();
		
		Faculty f  = new Faculty("Shree", "Bande", 3, "This is my");
		System.out.println(f);
		
		person p1 = new Student("Kiran","Bedi", 2002,67 , "MCA", 232424); // parent class can reference to child class but opposite is not possible.
		person p2 = new Faculty("Shree", "Bande", 3, "This is my");
	}

}
