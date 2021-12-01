package FruitBasket;

public class Fruits {
	
	private String name;

	public Fruits(String name) {
		super();
		this.name = name;
	}
	
	public Fruits()
	{
		
	}
	
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void taste()
	{
		System.out.println("Some fruits are sweet......");
	}
	
	
	
}
