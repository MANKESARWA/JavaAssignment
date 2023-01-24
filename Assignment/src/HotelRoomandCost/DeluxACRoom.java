package HotelRoomandCost;

public class DeluxACRoom extends HotelRoom {

	private int ratePerDay;

	public DeluxACRoom(String customerName, int numberOfDay, boolean hasTV, boolean hasWifi, int ratePerDay) {
		super(customerName, numberOfDay, hasTV, hasWifi);
		this.ratePerDay = 120;
	}

	HotelRoom hotelRoom = new HotelRoom();

	public int getRatePerDay() {

		if (isHasWifi()) {
			return (ratePerDay + 2);
		}
		return ratePerDay;
	}

}