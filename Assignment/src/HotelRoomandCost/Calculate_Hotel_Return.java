package HotelRoomandCost;

import javax.swing.*;

public class Calculate_Hotel_Return extends JFrame {
    String name;
    String days;
    String wifi;
    String tv;

    public Calculate_Hotel_Return() {

    }

    public void sethotelname(String name) {
        this.name = name;
    }

    public String gethotelname() {
        return name;
    }

    public void setwifiname(String wifi) {
        this.wifi = wifi;
    }

    public String getwifiname() {
        return wifi;
    }

    public void setdaysname(String days) {
        this.days = days;
    }

    public String getdaysname() {
        return days;
    }

    public void settvname(String tv) {
        this.tv = tv;
    }

    public String gettvname() {
        return tv;
    }

}
