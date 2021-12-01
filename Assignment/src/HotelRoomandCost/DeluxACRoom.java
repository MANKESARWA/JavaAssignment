package HotelRoomandCost;

public class DeluxACRoom extends DeluxRoom {

	public DeluxACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		ratePerSqFeet = 12;
	}
	
	

}
