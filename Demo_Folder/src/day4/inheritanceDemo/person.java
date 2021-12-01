package day4.inheritanceDemo;

public class person {
	private String firstName,lastName;
	public person(String firstName,String lastName)
	{
		System.out.println("In Person args setted Constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
	
	public void showEventResult()
	{
		System.out.println("Event Result : ");
	}
}


