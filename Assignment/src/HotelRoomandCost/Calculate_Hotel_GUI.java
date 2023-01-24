package HotelRoomandCost;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate_Hotel_GUI {

    String daysstay, wifiroom, tvroom, number;
    Calculate_Hotel_Return calchotel = new Calculate_Hotel_Return();

    Calculate_Hotel_GUI(String hotelname) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel hotel = new JLabel(hotelname);
        hotel.setBounds(100, 10, 100, 30);
        panel.add(hotel);

        JLabel days = new JLabel(" Days to Stay =");
        days.setBounds(20, 50, 200, 25);
        panel.add(days);

        JTextField daysfill = new JTextField(daysstay);
        daysfill.setBounds(200, 50, 150, 25);
        panel.add(daysfill);

        JLabel tv = new JLabel(" TV in Room (yes/no) = ");
        tv.setBounds(20, 70, 200, 25);
        panel.add(tv);

        JTextField tvfill = new JTextField(tvroom);
        tvfill.setBounds(200, 70, 150, 25);
        panel.add(tvfill);

        JLabel wifi = new JLabel(" Wi-Fi in Room (yes/no) = ");
        wifi.setBounds(20, 90, 200, 25);
        panel.add(wifi);

        JTextField wififill = new JTextField(wifiroom);
        wififill.setBounds(200, 90, 150, 25);
        panel.add(wififill);

        JButton button = new JButton();
        button.setText("Next");
        button.setFocusable(false);
        button.setBounds(80, 150, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = "1";
                calchotel.sethotelname(number);
                calchotel.setdaysname(daysfill.getText());
                calchotel.setwifiname(wififill.getText());
                calchotel.settvname(tvfill.getText());
                frame.dispose();
            }
        });
        panel.add(button);

        frame.setVisible(true);

    }

    public String getdays() {
        return calchotel.getdaysname();
    }

    public String getwifi() {
        return calchotel.getwifiname();
    }

    public String gettv() {
        return calchotel.gettvname();
    }

    public String getHotel() {
        return calchotel.gethotelname();
    }
}