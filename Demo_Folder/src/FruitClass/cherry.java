package FruitClass;

public class cherry extends Fruit {
	private String cherryName;

	public cherry(String name, String cherryName) {
		super(name);
		this.cherryName = cherryName;
	}
	
	@Override
	public void taste() {
		System.out.println("The taste is saure.");
	}
	
}
