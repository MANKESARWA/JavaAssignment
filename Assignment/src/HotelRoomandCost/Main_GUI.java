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
    Main_Return test = new Main_Return();

    Main_GUI() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

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

        JLabel phonenumlabel = new JLabel("Phone Number:");
        phonenumlabel.setBounds(10, 80, 170, 25);
        panel.add(phonenumlabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(120, 80, 80, 25);
        panel.add(phoneText);

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
                    frame.dispose();
                }
            }
        });

        panel.add(button);
        frame.setVisible(true);
    }

    public String getname() {
        return test.getname();
    }

    public String getphone() {
        return test.getphone();
    }
}