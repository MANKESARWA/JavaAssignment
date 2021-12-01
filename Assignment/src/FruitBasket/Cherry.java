package FruitBasket;

public class Cherry extends Fruits {

	public Cherry(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void createCherryJam()
	{
		System.out.println("we create cherry jam...");
	}

	@Override
	public void taste()
	{
		System.out.println("Cherry are sweet in taste...");
	}
	
}
