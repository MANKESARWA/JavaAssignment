package HotelRoomandCost;

public class SuiteACRoom extends HotelRoom {

	private int ratePerDay;

	public SuiteACRoom(String customerName, int numberOfDay, boolean hasTV, boolean hasWifi, int ratePerDay) {
		super(customerName, numberOfDay, hasTV, hasWifi);
		this.ratePerDay = 150;
	}

	public int getRatePerDay() {
		if (isHasWifi()) {
			return (ratePerDay + 2);
		}
		return ratePerDay;
	}

}