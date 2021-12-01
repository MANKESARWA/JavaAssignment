package CollectionAssignment;

import java.sql.Date;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private double Salary;
	private Date dateOfjoining;
	private Department dept;
	private Address address;
	
	public Employee(int empId, String firstName, String lastName, double salary, Date dateOfjoining, Department dept, Address address) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		Salary = salary;
		this.dateOfjoining = dateOfjoining;
		this.dept = dept;
		this.address = address;
	}
	
	
	

}
