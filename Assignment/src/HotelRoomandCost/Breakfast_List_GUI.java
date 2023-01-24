package HotelRoomandCost;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class Breakfast_List_GUI {

    String Answer;
    Food_List_Return breakfast = new Food_List_Return();

    Breakfast_List_GUI() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel menu = new JLabel("MEALS MENU ");
        menu.setBounds(100, 10, 100, 25);
        panel.add(menu);

        JLabel listofmeals = new JLabel("List of Meals For Breakfast");
        listofmeals.setBounds(60, 30, 200, 25);
        panel.add(listofmeals);

        JLabel firstchoice = new JLabel("A) Nasi Lemak ");
        firstchoice.setBounds(20, 50, 100, 25);
        panel.add(firstchoice);

        JLabel secondchoice = new JLabel("B) Coco Crunch with Milk ");
        secondchoice.setBounds(20, 70, 200, 25);
        panel.add(secondchoice);

        JLabel thirdchoice = new JLabel("C) Oatmeal");
        thirdchoice.setBounds(20, 90, 100, 25);
        panel.add(thirdchoice);

        JLabel fourthchoice = new JLabel("D) None");
        fourthchoice.setBounds(20, 110, 100, 25);
        panel.add(fourthchoice);

        JTextField userinput = new JTextField(20);
        userinput.setBounds(20, 150, 30, 25);
        panel.add(userinput);

        JLabel warning = new JLabel("*Please enter only 'A' or 'B' or 'C' or 'D' * ");
        warning.setBounds(20, 180, 300, 25);
        panel.add(warning);

        // JCheckBox check = new JCheckBox();
        JButton button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setBounds(100, 150, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Answer = userinput.getText();
                breakfast.setfoodname(Answer);
                frame.dispose();
            }
        });
        panel.add(button);
        frame.setVisible(true);

    }

    public String getfoodname() {
        return breakfast.getfoodname();
    }
}