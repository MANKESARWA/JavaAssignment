package FruitClass;

public class Orange extends Fruit{

	private String orangeName;

	public Orange(String name,String orangeName) {
		super(name);
		this.orangeName = orangeName;
	}
	@Override
	public void taste()
	{
		System.out.println("the taste of "+orangeName+" is tangy");
	}
}
