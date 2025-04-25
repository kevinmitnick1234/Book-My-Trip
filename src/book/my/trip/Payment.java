
package book.my.trip;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Prity
 */
public class Payment extends JFrame {

    public Payment() {
        setTitle("Payment Portal");
        setLayout(null);
        setBounds(600, 220, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 400, 45);
        add(label);

        // Load image safely
        try {
            ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
            Image i8 = i7.getImage().getScaledInstance(800, 400, Image.SCALE_SMOOTH);
            ImageIcon i9 = new ImageIcon(i8);
            JLabel l4 = new JLabel(i9);
            l4.setBounds(0, 100, 800, 400);
            add(l4);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Image not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        JButton pay = new JButton("Pay");
        pay.setBounds(420, 20, 80, 40);
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                new Paytm().setVisible(true);
            }
        });
        add(pay);

        JButton back = new JButton("Back");
        back.setBounds(510, 20, 80, 40);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Payment();
    }
}
