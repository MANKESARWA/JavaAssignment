package HotelRoomandCost;

import javax.swing.*;

public class Room_Choosed_Return extends JFrame {
    String name;

    public Room_Choosed_Return() {

    }

    public void setroomchoosed(String name) {
        this.name = name;
    }

    public String getroomchoosed() {
        return name;
    }

}
