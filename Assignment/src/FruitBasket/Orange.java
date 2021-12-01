package FruitBasket;

public class Orange extends Fruits{

	public Orange(String name) {
		super(name);
		
	}
	public void createJuice()
	{
		System.out.println("Orange juice are taste...");
	}
	
	@Override
	public void taste()
	{
		System.out.println("Oranges are tange in taste...");
	}
	

}
