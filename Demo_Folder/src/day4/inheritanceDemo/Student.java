package day4.inheritanceDemo;

public class Student extends person {
	// student:  first name and last name with person(parent class)
	private int grdyear,marks;
	private String coursName;
	private double fees;
	
	
	// adding a constructor for initializing the data members.
	public Student(String firstName, String lastName, int grdyear, int marks, String coursName, double fees) {
		super(firstName, lastName);
		this.grdyear = grdyear;
		this.marks = marks;
		this.coursName = coursName;
		this.fees = fees;
		System.out.println("In Student class constructor.");
	}
	
	@Override
	public String toString() {
		return "Student ["+super.toString()+" grdyear=" + grdyear + ", marks=" + marks + ", coursName=" + coursName + ", fees=" + fees + "]";
	}
	
	public void showEventResult()
	{
		System.out.println("-----------Student Event Result -------------------");
	}
	
	
}
