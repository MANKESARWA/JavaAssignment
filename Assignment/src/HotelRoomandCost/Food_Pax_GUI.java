package HotelRoomandCost;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class Food_Pax_GUI {

    String Answer;
    Food_List_Return pax = new Food_List_Return();

    Food_Pax_GUI() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel menu = new JLabel("MEALS MENU ");
        menu.setBounds(80, 10, 100, 25);
        panel.add(menu);

        JLabel listofmeals = new JLabel("Meals has been confirmed");
        listofmeals.setBounds(60, 30, 200, 25);
        panel.add(listofmeals);

        JLabel firstchoice = new JLabel("For how many person will this meals be provided? ");
        firstchoice.setBounds(20, 50, 400, 25);
        panel.add(firstchoice);

        JTextField userinput = new JTextField(20);
        userinput.setBounds(20, 80, 30, 25);
        panel.add(userinput);

        JLabel warning = new JLabel("*Please enter numbers ranging from ");
        warning.setBounds(20, 110, 300, 25);
        panel.add(warning);

        JLabel warning2 = new JLabel("from 0 to desired family members *");
        warning2.setBounds(20, 130, 300, 25);
        panel.add(warning2);

        // JCheckBox check = new JCheckBox();
        JButton button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setBounds(100, 160, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Answer = userinput.getText();
                pax.setfoodname(Answer);
                frame.dispose();

            }
        });
        panel.add(button);
        frame.setVisible(true);

    }

    public String getname() {
        return pax.getfoodname();
    }
}