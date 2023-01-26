package HotelRoomandCost;

public class DeluxRoom extends HotelRoom {

	private int ratePerDay;

	public DeluxRoom(String customerName, int numberOfDay, boolean hasTV, boolean hasWifi, int ratePerDay) {
		super(customerName, numberOfDay, hasTV, hasWifi);
		this.ratePerDay = 100;
	}

	HotelRoom hotelRoom = new HotelRoom();

	public int getRatePerDay() {

		if (isHasWifi()) {
			return (ratePerDay + 2);
		}
		return ratePerDay;
	}
}