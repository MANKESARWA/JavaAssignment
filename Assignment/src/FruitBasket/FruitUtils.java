package FruitBasket;

public class FruitUtils {
	
	public static void addFruit()
	{
		Fruits basket = new Fruits();
		basket =  new Apple(basket.getName());
		basket = new Orange(basket.getName());
		basket = new Cherry(basket.getName());
	}
	

}
