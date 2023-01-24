package HotelRoomandCost;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_Confirmation_GUI {
    String number = "0";
    Food_Confirmation_Return food_confirm = new Food_Confirmation_Return();

    Food_Confirmation_GUI(String breakfastfood, String lunchfood, String dinnerfood, String paxfood, int bprice,
            int lprice, int dprice) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);

        JLabel menu = new JLabel("MEALS MENU ");
        menu.setBounds(110, 10, 100, 25);
        panel.add(menu);

        JLabel listofmeals = new JLabel("List of Meals Confirmed");
        listofmeals.setBounds(90, 30, 200, 25);
        panel.add(listofmeals);

        JLabel bfast = new JLabel(" Breakfast = ");
        bfast.setBounds(20, 70, 200, 25);
        panel.add(bfast);

        JLabel bfastfill = new JLabel(breakfastfood);
        bfastfill.setBounds(130, 70, 200, 25);
        panel.add(bfastfill);

        JLabel bfastprice = new JLabel(" RM " + bprice);
        bfastprice.setBounds(300, 70, 200, 25);
        panel.add(bfastprice);

        JLabel lunch = new JLabel(" Lunch = ");
        lunch.setBounds(20, 90, 200, 25);
        panel.add(lunch);

        JLabel lunchfill = new JLabel(lunchfood);
        lunchfill.setBounds(130, 90, 200, 25);
        panel.add(lunchfill);

        JLabel lunchprice = new JLabel(" RM " + lprice);
        lunchprice.setBounds(300, 90, 200, 25);
        panel.add(lunchprice);

        JLabel dinner = new JLabel(" Dinner = ");
        dinner.setBounds(20, 110, 200, 25);
        panel.add(dinner);

        JLabel dinnerfill = new JLabel(dinnerfood);
        dinnerfill.setBounds(130, 110, 200, 25);
        panel.add(dinnerfill);

        JLabel dinnerprice = new JLabel(" RM " + dprice);
        dinnerprice.setBounds(300, 110, 200, 25);
        panel.add(dinnerprice);

        JLabel pax = new JLabel(" Total Pax = ");
        pax.setBounds(20, 130, 200, 25);
        panel.add(pax);

        JLabel paxfill = new JLabel(paxfood);
        paxfill.setBounds(130, 130, 200, 25);
        panel.add(paxfill);

        // JCheckBox check = new JCheckBox();
        JButton button = new JButton();
        button.setText("Continue");
        button.setFocusable(false);
        button.setBounds(105, 170, 100, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = "1";
                food_confirm.setfoodchoosed(number);
                frame.dispose();
            }
        });
        panel.add(button);
        frame.setVisible(true);

    }

    public String getroomchoosed() {
        return food_confirm.getfoodchoosed();
    }
}