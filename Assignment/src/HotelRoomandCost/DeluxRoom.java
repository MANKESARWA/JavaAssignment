package HotelRoomandCost;

public class DeluxRoom extends HotelRoom{
	
	private int ratePerSqFeet;

	public DeluxRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	

	HotelRoom hotelRoom =  new HotelRoom();
	public int getRatePerSqFeet()
	{
		
		if(isHasWifi())
		{
			return (ratePerSqFeet+2);
		}
		return ratePerSqFeet;
	}
	
}
