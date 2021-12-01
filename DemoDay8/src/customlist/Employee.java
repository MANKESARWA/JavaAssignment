package customlist;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	private Department dept;
	private Date doj;
	
	public static SimpleDateFormat sdf;
	static
	{
		sdf = new SimpleDateFormat("dd-mm-yyyy");
	}
	
		
	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name, double salary, Department dept, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Employee.sdf = sdf;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", doj=" + sdf.format(doj) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("my equal method");
		if(obj instanceof Employee) {
		return this.id ==((Employee)obj).id;
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("In compare to method");
		if(this.id<o.getId()) {
			return -1;
		}
		if(this.id==o.getId())
		{
			return 0;
		}
		return 1;
	}
	
	
	

}
