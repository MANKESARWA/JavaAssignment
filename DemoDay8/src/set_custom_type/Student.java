package set_custom_type;

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Student's equal");
		if(obj instanceof Student)
		{
			return this.rollNo == ((Student)obj).rollNo;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return this.rollNo;
	}
	
	
	
	
}
