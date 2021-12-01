package HotelRoomandCost;
import java.util.Scanner;

public class HotelTariffCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String tv,wifi;
		HotelRoom hotel = new HotelRoom();
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\n");
		System.out.println("Select Room Type: \n");
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("Hotel Name:");
				hotel.setHotelName(sc.next());
				System.out.println("Room Square Feet Area: ");
				hotel.setNumberOfSqFeet(sc.nextInt());
				System.out.println("Room has TV (yes/no)");
				 tv = sc.next().toLowerCase();
				 if(tv.equals("yes"))
					 hotel.setHasTV(true);
				 else
					 hotel.setHasTV(false);
				System.out.println("Room has Wifi (yes/no)");
				wifi = sc.next().toLowerCase();
				if(wifi.equals("yes"))
				{
					hotel.setHasWifi(true);
				}
				else
				{
					hotel.setHasWifi(false);
				}
				hotel = new DeluxRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(), hotel.isHasTV(), hotel.isHasWifi(), hotel.getRatePerSqFeet());
				
				System.out.println("Room Tariff per day is : "+hotel.calculateTariff());
				break;
			case 2:
				System.out.println("Hotel Name:");
				hotel.setHotelName(sc.next());
				System.out.println("Room Square Feet Area: ");
				hotel.setNumberOfSqFeet(sc.nextInt());
				System.out.println("Room has TV (yes/no)");
				 tv = sc.next().toLowerCase();
				 if(tv.equals("yes"))
					 hotel.setHasTV(true);
				 else
				hotel.setHasTV(false);
				System.out.println("Room has Wifi (yes/no)");
				wifi = sc.next().toLowerCase();
				if(wifi.equals("yes"))
				{
					hotel.setHasWifi(true);
				}
				else
				{
					hotel.setHasWifi(false);
				}
				hotel = new DeluxACRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(), hotel.isHasTV(), hotel.isHasWifi(), hotel.getRatePerSqFeet());
				System.out.println("Room Tariff per day is : "+hotel.calculateTariff());
				break;
			case 3:
				System.out.println("Hotel Name:");
				hotel.setHotelName(sc.next());
				System.out.println("Room Square Feet Area: ");
				hotel.setNumberOfSqFeet(sc.nextInt());
				System.out.println("Room has TV (yes/no)");
				 tv = sc.next().toLowerCase();
				 if(tv.equals("yes"))
					 hotel.setHasTV(true);
				 else
					 hotel.setHasTV(false);
				System.out.println("Room has Wifi (yes/no)");
				wifi = sc.next().toLowerCase();
				if(wifi.equals("yes"))
				{
					hotel.setHasWifi(true);
				}
				else
				{
					hotel.setHasWifi(false);
				}
				hotel = new SuiteACRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(), hotel.isHasTV(), hotel.isHasWifi(), hotel.getRatePerSqFeet());
				System.out.println("Room Tariff per day is : "+hotel.calculateTariff());
				break;
				
		}
		sc.close();
				
	}

}


