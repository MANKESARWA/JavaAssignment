package HotelRoomandCost;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
// import java.swing.JFrame;
import java.util.Scanner;

import javax.swing.JFrame;

public class HotelTariffCalculator {
	// String CustName, CustPhone, tv, wifi;
	JFrame frame;
	// Main_Menu_GUI gui;

	public static void main(String[] args) {
		String CustName, CustPhone, hotelname, tv, wifi;
		Main_GUI gui = new Main_GUI();
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

		// JFrame frame = new JFrame();
		// // Scanner sc = new Scanner(System.in);
		// String CustName, CustPhone, tv, wifi;
		// Main_Menu_GUI gui = new Main_Menu_GUI(frame);
		// Main_Menu menu = new Main_Menu(frame, gui);
		// menu.start();
		// CustName = gui.getname();
		// CustPhone = gui.getphone();
		// System.out.println("Name : " + CustName);
		// System.out.println("Phone : " + CustPhone);
		// frame.addWindowListener(new WindowAdapter() {

		// public void windowClosing(WindowEvent e) {
		// // Proceed with the rest of the program
		// CustName = gui.getname();
		// CustPhone = gui.getphone();
		// System.out.println("Name : " + CustName);
		// System.out.println("Phone : " + CustPhone);
		// // The rest of the code goes here
		// }
		// HotelRoom hotel = new HotelRoom();

		// System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC
		// Room\n3. Suite AC Room\n");
		// System.out.println("Select Room Type: \n");
		// switch (sc.nextInt()) {
		// case 1:
		// System.out.println("Hotel Name:");
		// hotel.setHotelName(sc.next());
		// System.out.println("Room Square Feet Area: ");
		// hotel.setNumberOfSqFeet(sc.nextInt());
		// System.out.println("Room has TV (yes/no)");
		// tv = sc.next().toLowerCase();
		// if (tv.equals("yes"))
		// hotel.setHasTV(true);
		// else
		// hotel.setHasTV(false);
		// System.out.println("Room has Wifi (yes/no)");
		// wifi = sc.next().toLowerCase();
		// if (wifi.equals("yes")) {
		// hotel.setHasWifi(true);
		// } else {
		// hotel.setHasWifi(false);
		// }
		// hotel = new DeluxRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(),
		// hotel.isHasTV(),
		// hotel.isHasWifi(), hotel.getRatePerSqFeet());

		// System.out.println("Room Tariff per day is : " + hotel.calculateTariff());
		// break;
		// case 2:
		// System.out.println("Hotel Name:");
		// hotel.setHotelName(sc.next());
		// System.out.println("Room Square Feet Area: ");
		// hotel.setNumberOfSqFeet(sc.nextInt());
		// System.out.println("Room has TV (yes/no)");
		// tv = sc.next().toLowerCase();
		// if (tv.equals("yes"))
		// hotel.setHasTV(true);
		// else
		// hotel.setHasTV(false);
		// System.out.println("Room has Wifi (yes/no)");
		// wifi = sc.next().toLowerCase();
		// if (wifi.equals("yes")) {
		// hotel.setHasWifi(true);
		// } else {
		// hotel.setHasWifi(false);
		// }
		// hotel = new DeluxACRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(),
		// hotel.isHasTV(),
		// hotel.isHasWifi(), hotel.getRatePerSqFeet());
		// System.out.println("Room Tariff per day is : " + hotel.calculateTariff());
		// break;
		// case 3:
		// System.out.println("Hotel Name:");
		// hotel.setHotelName(sc.next());
		// System.out.println("Room Square Feet Area: ");
		// hotel.setNumberOfSqFeet(sc.nextInt());
		// System.out.println("Room has TV (yes/no)");
		// tv = sc.next().toLowerCase();
		// if (tv.equals("yes"))
		// hotel.setHasTV(true);
		// else
		// hotel.setHasTV(false);
		// System.out.println("Room has Wifi (yes/no)");
		// wifi = sc.next().toLowerCase();
		// if (wifi.equals("yes")) {
		// hotel.setHasWifi(true);
		// } else {
		// hotel.setHasWifi(false);
		// }
		// hotel = new SuiteACRoom(hotel.getHotelName(), hotel.getNumberOfSqFeet(),
		// hotel.isHasTV(),
		// hotel.isHasWifi(), hotel.getRatePerSqFeet());
		// System.out.println("Room Tariff per day is : " + hotel.calculateTariff());
		// break;

		// }
		// sc.close();

		// });

	}
}
