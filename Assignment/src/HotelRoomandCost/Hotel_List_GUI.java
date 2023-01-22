package HotelRoomandCost;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class Hotel_List_GUI {
    String Answer;
    Hotel_List_Return hotellist = new Hotel_List_Return();

    Hotel_List_GUI() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel menu = new JLabel("MENU");
        menu.setBounds(120, 10, 100, 25);
        panel.add(menu);

        JLabel listofhotel = new JLabel("List of Hotel");
        listofhotel.setBounds(100, 30, 200, 25);
        panel.add(listofhotel);

        JLabel firstchoice = new JLabel("A) U Hotel ");
        firstchoice.setBounds(20, 50, 100, 25);
        panel.add(firstchoice);

        JLabel secondchoice = new JLabel("B) Hotel Meridion ");
        secondchoice.setBounds(20, 70, 200, 25);
        panel.add(secondchoice);

        JLabel thirdchoice = new JLabel("C) IOI City Hotel ");
        thirdchoice.setBounds(20, 90, 100, 25);
        panel.add(thirdchoice);

        JTextField userinput = new JTextField(20);
        userinput.setBounds(20, 130, 30, 25);
        panel.add(userinput);

        JLabel warning = new JLabel("**Please enter only 'A' or 'B' or 'C' ** ");
        warning.setBounds(20, 170, 300, 25);
        panel.add(warning);

        JButton button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setBounds(100, 125, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Answer = userinput.getText();
                hotellist.sethotelname(Answer);
                frame.dispose();
            }
        });
        panel.add(button);
        frame.setVisible(true);

    }

    public String getname() {
        return hotellist.gethotelname();
    }

}