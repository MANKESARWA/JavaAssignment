package HotelRoomandCost;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Room_Choosed_GUI {
    String number = "0";
    Room_Choosed_Return room_choosed = new Room_Choosed_Return();

    Room_Choosed_GUI(String roomname, String totalroomprice) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel menu = new JLabel("Hotel Confirmation");
        menu.setBounds(80, 20, 150, 25);
        panel.add(menu);

        JLabel room = new JLabel("Room = ");
        room.setBounds(20, 60, 80, 25);
        panel.add(room);

        JLabel roomfill = new JLabel(roomname);
        roomfill.setBounds(80, 60, 150, 25);
        panel.add(roomfill);

        JLabel price = new JLabel("Price  = ");
        price.setBounds(20, 80, 80, 25);
        panel.add(price);

        JLabel pricefill = new JLabel(totalroomprice);
        pricefill.setBounds(80, 80, 80, 25);
        panel.add(pricefill);

        JButton button = new JButton();
        button.setText("Continue");
        button.setFocusable(false);
        button.setBounds(50, 110, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = "1";
                room_choosed.setroomchoosed(number);
                frame.dispose();
            }
        });

        panel.add(button);

        frame.setVisible(true);
    }

    public String getroomchoosed() {
        return room_choosed.getroomchoosed();
    }
}