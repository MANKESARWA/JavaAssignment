package HotelRoomandCost;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoice_GUI {

    Invoice_GUI(String custname, String custphone, String hotelname, String roomname, String totalroom,
            String totalmeal, String totalprice) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel menu = new JLabel(" INVOICE");
        menu.setBounds(80, 10, 100, 25);
        panel.add(menu);

        JLabel name = new JLabel(" Name : ");
        name.setBounds(20, 50, 200, 25);
        panel.add(name);

        JLabel phone = new JLabel(" Phone :");
        phone.setBounds(20, 70, 200, 25);
        panel.add(phone);

        JLabel Hotel = new JLabel(" Hotel :");
        Hotel.setBounds(20, 90, 200, 25);
        panel.add(Hotel);

        JLabel room = new JLabel(" Room : ");
        room.setBounds(20, 110, 200, 25);
        panel.add(room);

        JLabel totroom = new JLabel(" Total Room : ");
        totroom.setBounds(20, 130, 200, 25);
        panel.add(totroom);

        JLabel totfood = new JLabel(" Total Food : ");
        totfood.setBounds(20, 150, 200, 25);
        panel.add(totfood);

        JLabel totbill = new JLabel(" Total Bill : ");
        totbill.setBounds(20, 170, 200, 25);
        panel.add(totbill);

        JLabel fillname = new JLabel(custname);
        fillname.setBounds(120, 50, 200, 25);
        panel.add(fillname);

        JLabel fillphone = new JLabel(custphone);
        fillphone.setBounds(120, 70, 200, 25);
        panel.add(fillphone);

        JLabel fillhotel = new JLabel(hotelname);
        fillhotel.setBounds(120, 90, 200, 25);
        panel.add(fillhotel);

        JLabel fillroom = new JLabel(roomname);
        fillroom.setBounds(120, 110, 200, 25);
        panel.add(fillroom);

        JLabel filltotroom = new JLabel("RM " + totalroom);
        filltotroom.setBounds(120, 130, 200, 25);
        panel.add(filltotroom);

        JLabel filltotfood = new JLabel("RM " + totalmeal);
        filltotfood.setBounds(120, 150, 200, 25);
        panel.add(filltotfood);

        JLabel filltotbill = new JLabel("RM " + totalprice);
        filltotbill.setBounds(120, 170, 200, 25);
        panel.add(filltotbill);

        JButton button = new JButton();
        button.setText("Finish");
        button.setFocusable(false);
        button.setBounds(40, 210, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panel.add(button);

        JLabel note = new JLabel(" Please Come Again ");
        note.setBounds(20, 240, 200, 25);
        panel.add(note);

        frame.setVisible(true);

    }

}