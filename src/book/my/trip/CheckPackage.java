package book.my.trip;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    String[] package1 = {
        "GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour", "Daily Buffet",
        "Soft Drinks Free", "English Speaking Guide", "Cruise with Dinner", "SUMMER SPECIAL", "BOOK PACKAGE",
        "BDT 15000/-", "package1.jpg"
    };
    String[] package2 = {
        "SILVER PACKAGE", "4 Days and 5 Nights", "Toll Free", "Entrance", "Meet and Greet at Airport",
        "Welcome Drink on Arrival", "Night Safari", "Candle Light Dinner", "WINTER SPECIAL", "BOOK NOW",
        "BDT 20000/-", "package2.jpg"
    };
    String[] package3 = {
        "BRONZE PACKAGE", "5 Days and 5 Nights", "Return Airfare", "Free Clubbing", "Horse Riding and other Games",
        "River Rafting", "Daily Buffet", "BBQ Dinner", "MONSOON SPECIAL", "BOOK NOW",
        "BDT 22000/-", "package3.jpg"
    };

    CheckPackage() {
        setBounds(450, 200, 900, 600);

        JTabbedPane tab = new JTabbedPane();
        tab.addTab("Package 1", null, createPackage(package1));
        tab.addTab("Package 2", null, createPackage(package2));
        tab.addTab("Package 3", null, createPackage(package3));

        add(tab);
        setVisible(true);
    }

    public JPanel createPackage(String[] pack) {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);

        JLabel title = new JLabel(pack[0]);
        title.setBounds(50, 5, 400, 30);
        title.setForeground(Color.ORANGE);
        title.setFont(new Font("Tahoma", Font.BOLD, 30));
        p.add(title);

        for (int i = 1; i <= 7; i++) {
            JLabel label = new JLabel(pack[i]);
            label.setBounds(50, 30 + (i * 50), 300, 30);
            label.setForeground(Color.BLUE);
            label.setFont(new Font("Tahoma", Font.BOLD, 20));
            p.add(label);
        }

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p.add(image);

        // Seasonal Label
        JLabel season = new JLabel(pack[8]);
        season.setBounds(50, 410, 300, 30);
        season.setForeground(new Color(255, 102, 0)); // Orange tone
        season.setFont(new Font("Tahoma", Font.BOLD, 22));
        p.add(season);

        // Book Now Label (moved between season and price)
        JLabel book = new JLabel(pack[9]);
        book.setBounds(50, 450, 200, 30);
        book.setForeground(Color.MAGENTA);
        book.setFont(new Font("Tahoma", Font.BOLD, 24));
        p.add(book);

        // Price
        JLabel price = new JLabel(pack[10]);
        price.setBounds(500, 450, 300, 30);
        price.setForeground(Color.CYAN);
        price.setFont(new Font("Tahoma", Font.BOLD, 22));
        p.add(price);

        return p;
    }

    public static void main(String[] args) {
        new CheckPackage();
    }
}
