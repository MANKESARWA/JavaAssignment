package FruitBasket;

public class Apple extends Fruits{

	public Apple(String name) {
		super(name);
		
	}
	
	public void createJam()
	{
		System.out.println("we create apple jam.");
	}
	
	
	@Override
	public void taste()
	{
		System.out.println("Apple are sweet in taste....");
	}
		
}
