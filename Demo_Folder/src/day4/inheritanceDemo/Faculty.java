package day4.inheritanceDemo;

public class Faculty extends person {
	
	private int expYear;
	private String sme;
	public Faculty(String firstName, String lastName,int expYear,String sme) {
		super(firstName, lastName);
		this.expYear=expYear;
		this.sme=sme;
		System.out.println("In the faculty constructor.");
	}
	@Override
	public String toString() {
		return "Faculty ["+super.toString()+" expYear=" + expYear + ", sme=" + sme + "]";
	}
	
	public void showEventResult()
	{
		System.out.println("-----------Faculty Event Result -------------------");
	}
	
	
	
	
	
}
