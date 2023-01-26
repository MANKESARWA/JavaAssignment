package HotelRoomandCost;

public class HotelRoom {

	private String customerName;
	private int numberOfDay;
	private boolean hasTV;
	private boolean hasWifi;

	public HotelRoom(String customerName, int numberOfDay, boolean hasTV, boolean hasWifi) {
		super();
		this.customerName = customerName;
		this.numberOfDay = numberOfDay;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}

	public HotelRoom() {

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(int numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public int calculateTariff() {
		return numberOfDay * getRatePerDay();
	}

	public int getRatePerDay() {
		return 0;
	}

}