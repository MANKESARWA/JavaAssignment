package HotelRoomandCost;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main_GUI extends JFrame {
    String name;
    String phoneNum;
    JFrame frame;
    JPanel panel;
    Main_Test test = new Main_Test();

    Main_GUI() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel welcomelabel = new JLabel("Welcome");
        welcomelabel.setBounds(100, 10, 80, 25);
        panel.add(welcomelabel);

        JLabel namelabel = new JLabel("Name:");
        namelabel.setBounds(10, 50, 80, 25);
        panel.add(namelabel);

        JTextField nameText = new JTextField(30);
        nameText.setBounds(120, 50, 80, 25);
        panel.add(nameText);

        // nameText.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // String name = nameText.getText();
        // System.out.println("Name: " + name);
        // }
        // });

        JLabel phonenumlabel = new JLabel("Phone Number:");
        phonenumlabel.setBounds(10, 80, 170, 25);
        panel.add(phonenumlabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(120, 80, 80, 25);
        panel.add(phoneText);

        // phoneText.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // String phoneNum = phoneText.getText();
        // System.out.println("Phone Number: " + phoneNum);
        // }
        // });

        JButton button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setBounds(100, 125, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = nameText.getText();
                phoneNum = phoneText.getText();
                if (e.getSource() == button) {
                    test.setname(name);
                    test.setphone(phoneNum);
                    // frame.setVisible(false);
                    frame.dispose();
                }
                // System.out.println("Name: " + name);
                // System.out.println("Phone Number: " + phoneNum);
                // HotelTariffCalculator hotel = new HotelTariffCalculator();
                // hotel.setModal(true);
                // hotel.setVisible(true);
            }
        });

        panel.add(button);
        // frame.addWindowListener(new WindowAdapter() {
        // public void windowClosing(WindowEvent e) {

        // }
        // });
        frame.setVisible(true);
    }

    public String getname() {
        return test.getname();
    }

    public String getphone() {
        return test.getphone();
    }
}