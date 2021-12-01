package HotelRoomandCost;

public class SuiteACRoom extends HotelRoom{
	
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	HotelRoom hotelRoom = new HotelRoom();
	
	
	public int getRatePerSqFeet() {
		if(isHasWifi())
		{
			return (ratePerSqFeet+2);
		}
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	

}
