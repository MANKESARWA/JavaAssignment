package CollectionAssignment;

public class Department {
	
	private int deptId;
	private String deptName;
	private String location;
	
	public Department(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}
	
	public Department()
	{
		
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
