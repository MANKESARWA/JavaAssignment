package HotelRoomandCost;

import javax.swing.JFrame;

public class HotelTariffCalculator {
	// String CustName, CustPhone, tv, wifi;
	JFrame frame;
	// Main_Menu_GUI gui;

	public static void main(String[] args) {
		String CustName, CustPhone, hotelname, roomname, constantNum, breakfastcode, lunchcode,
				dinnercode, paxcode, food_choose, days, tv, wifi, hotelNumber;
		int bprice, lprice, dprice, totprice;
		Main_GUI gui = new Main_GUI();
		HotelRoom hotelroom = new HotelRoom();
		CustName = gui.getname();
		CustPhone = gui.getphone();
		while (CustName == null || CustName.equals("")) {
			CustName = gui.getname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (CustPhone == null || CustPhone.equals("")) {
			CustPhone = gui.getphone();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Name : " + CustName);
		System.out.println("Phone : " + CustPhone);

		Hotel_List_GUI hotel = new Hotel_List_GUI();
		hotelname = hotel.getname();
		while (hotelname == null || hotelname.equals("")) {
			hotelname = hotel.getname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hotel : " + hotelname);

		if ("A".equalsIgnoreCase(hotelname)) {
			hotelname = "U Hotel";
		} else if ("B".equalsIgnoreCase(hotelname)) {
			hotelname = "Hotel Meridion";
		} else {
			hotelname = "IOI City Hotel";
		}

		System.out.println("Hotel : " + hotelname);

		Room_List_GUI room = new Room_List_GUI();
		roomname = room.getroomname();
		while (roomname == null || roomname.equals("")) {
			roomname = room.getroomname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Calculate_Hotel_GUI hotelfunction = new Calculate_Hotel_GUI(hotelname);
		hotelNumber = hotelfunction.getHotel();
		days = hotelfunction.getdays();
		wifi = hotelfunction.getwifi();
		tv = hotelfunction.gettv();
		while ((hotelNumber == null || hotelNumber.equals("")) && (days == null || days.equals(" "))
				&& (wifi == null || wifi.equals(" ")) && (tv == null || tv.equals(" "))) {
			hotelNumber = hotelfunction.getHotel();
			days = hotelfunction.getdays();
			wifi = hotelfunction.getwifi();
			tv = hotelfunction.gettv();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hotel : " + hotelNumber);
		System.out.println("Days : " + days);
		System.out.println("Wifi : " + wifi);
		System.out.println("Tv : " + tv);

		int daysinint = Integer.parseInt(days);

		switch (roomname) {
			case "A":
				if (tv.equals("yes"))
					hotelroom.setHasTV(true);
				else
					hotelroom.setHasTV(false);
				if (wifi.equals("yes")) {
					hotelroom.setHasWifi(true);
				} else {
					hotelroom.setHasWifi(false);
				}
				hotelroom = new DeluxRoom(CustName, daysinint, hotelroom.isHasTV(),
						hotelroom.isHasWifi(), hotelroom.getRatePerDay());
				// System.out.println("Room Tariff is : "+hotelroom.calculateTariff());
				break;
			case "B":

				if (tv.equals("yes"))
					hotelroom.setHasTV(true);
				else
					hotelroom.setHasTV(false);
				if (wifi.equals("yes")) {
					hotelroom.setHasWifi(true);
				} else {
					hotelroom.setHasWifi(false);
				}
				hotelroom = new DeluxACRoom(CustName, daysinint,
						hotelroom.isHasTV(), hotelroom.isHasWifi(), hotelroom.getRatePerDay());
				// System.out.println("Room Tariff is : "+hotelroom.calculateTariff());
				break;
			case "C":
				if (tv.equals("yes"))
					hotelroom.setHasTV(true);
				else
					hotelroom.setHasTV(false);
				if (wifi.equals("yes")) {
					hotelroom.setHasWifi(true);
				} else {
					hotelroom.setHasWifi(false);
				}
				hotelroom = new SuiteACRoom(CustName, daysinint,
						hotelroom.isHasTV(), hotelroom.isHasWifi(), hotelroom.getRatePerDay());
				// System.out.println("Room Tariff is : "+hotelroom.calculateTariff());
				break;

		}

		String totalroom = Integer.toString(hotelroom.calculateTariff());

		if ("A".equalsIgnoreCase(roomname)) {
			roomname = "Deluxe Room";
		} else if ("B".equalsIgnoreCase(roomname)) {
			roomname = "Standard Room";
		} else {
			roomname = "Suit Room";
		}

		System.out.println("Room : " + roomname);

		Room_Choosed_GUI roomchoosed = new Room_Choosed_GUI(roomname, totalroom);
		constantNum = roomchoosed.getroomchoosed();
		while (constantNum == null || constantNum.equals("")) {
			constantNum = roomchoosed.getroomchoosed();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Room : " + roomname);

		Breakfast_List_GUI breakfast = new Breakfast_List_GUI();
		breakfastcode = breakfast.getfoodname();
		while (breakfastcode == null || breakfastcode.equals("")) {
			breakfastcode = breakfast.getfoodname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if ("A".equalsIgnoreCase(breakfastcode)) {
			breakfastcode = "Nasi Lemak";
		} else if ("B".equalsIgnoreCase(breakfastcode)) {
			breakfastcode = "Cococrunch with Milk";
		} else if ("C".equalsIgnoreCase(breakfastcode)) {
			breakfastcode = "Oatmeal";
		} else {
			breakfastcode = "None";
		}

		System.out.println("Breakfast : " + breakfastcode);

		Lunch_List_GUI lunch = new Lunch_List_GUI();
		lunchcode = lunch.getfoodname();
		while (lunchcode == null || lunchcode.equals("")) {
			lunchcode = lunch.getfoodname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if ("A".equalsIgnoreCase(lunchcode)) {
			lunchcode = "Nasi Daging";
		} else if ("B".equalsIgnoreCase(lunchcode)) {
			lunchcode = "Nasi Udang Gulai Lemak";
		} else if ("C".equalsIgnoreCase(lunchcode)) {
			lunchcode = "Spaghetti Bologneise";
		} else {
			lunchcode = "None";
		}

		System.out.println("Lunch : " + lunchcode);

		Dinner_List_GUI dinner = new Dinner_List_GUI();
		dinnercode = dinner.getfoodname();
		while (dinnercode == null || dinnercode.equals("")) {
			dinnercode = dinner.getfoodname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if ("A".equalsIgnoreCase(dinnercode)) {
			dinnercode = "Char Kuey Teow";
		} else if ("B".equalsIgnoreCase(dinnercode)) {
			dinnercode = "Nasi Putih Siakap 3 Rasa";
		} else if ("C".equalsIgnoreCase(dinnercode)) {
			dinnercode = "Fish and Chips";
		} else {
			dinnercode = "None";
		}

		System.out.println("Dinner : " + dinnercode);

		Food_Pax_GUI pax = new Food_Pax_GUI();
		paxcode = pax.getname();
		while (paxcode == null || paxcode.equals("")) {
			paxcode = pax.getname();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Pax : " + paxcode);

		if ("None".equalsIgnoreCase(breakfastcode)) {
			bprice = 0;
		} else {
			bprice = 5;
		}

		if ("None".equalsIgnoreCase(lunchcode)) {
			lprice = 0;
		} else {
			lprice = 15;
		}

		if ("None".equalsIgnoreCase(dinnercode)) {
			dprice = 0;
		} else {
			dprice = 25;
		}

		Food_Confirmation_GUI foodchoosen = new Food_Confirmation_GUI(breakfastcode, lunchcode, dinnercode, paxcode,
				bprice, lprice, dprice);
		food_choose = foodchoosen.getroomchoosed();
		while (food_choose == null || food_choose.equals("")) {
			food_choose = foodchoosen.getroomchoosed();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Room : " + food_choose);

		int totpax = Integer.parseInt(paxcode);

		int totmealint = (bprice + lprice + dprice) * totpax * daysinint;

		String totmeal = Integer.toString(totmealint);

		String totroom = Integer.toString(hotelroom.calculateTariff());

		totprice = totmealint + hotelroom.calculateTariff();
		String totpricestring = Integer.toString(totprice);

		Invoice_GUI invoice = new Invoice_GUI(CustName, CustPhone, hotelname, roomname, totroom, totmeal,
				totpricestring);
	}
}