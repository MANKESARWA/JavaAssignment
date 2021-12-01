package demo.enums;

public enum Menu {
	SOUP(100),RICE(150),NOODLES(151),DIMSUM(120);
	
	private int price;

	private Menu(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
