package FruitClass;

public class Apple extends Fruit {
	
	private String appleName;

	public Apple(String name, String appleName) {
		super(name);
		this.appleName = appleName;
	}
	@Override
	public void taste() {
		System.out.println("The taste of "+appleName+" is good");
		}

	@Override
	public String toString() {
		return "Apple [appleName=" + appleName + "]";
	}
	
	public void createJam() {
		System.out.println("Apple jam created.");
	}
	
	
}
