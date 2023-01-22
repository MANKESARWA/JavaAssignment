package HotelRoomandCost;

import java.util.jar.Attributes.Name;

public class HotelRoom {
	private String Custname;
	private String Custphone;
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV;
	private boolean hasWifi;

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}

	public HotelRoom() {

	}

	public void setname(String Custname) {
		this.Custname = Custname;
	}

	public String getCustName() {
		return Custname;
	}

	public void setPhone(String Custphone) {
		this.Custphone = Custphone;
	}

	public String getCustPhone() {
		return Custphone;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
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
		return numberOfSqFeet * getRatePerSqFeet();
	}

	public int getRatePerSqFeet() {
		return 0;
	}

}
