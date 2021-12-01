package day4.inheritanceDemo;

public class testPoly {

	public static void main(String[] args) {
		
		person p = new Student("Kiran","Jadhav",2020,23,"MCA",21312);
		
		person p1 = new Faculty("DEV", "KUL", 3, "JAVA");
		
		p.showEventResult(); // till compliaction the method is to be decide to be called by person class but at run time JRE will call the method from student class
		p1.showEventResult();// till compliaction the method is to be decide to be called by person class but at run time JRE will call the method from faculty class
	}

}
