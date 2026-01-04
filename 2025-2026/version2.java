import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Coffee Order Form");
        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        f.add(new JLabel("Customer Name:"));
        f.add(new JTextField(10));

        f.add(new JLabel("Payment:"));
        f.add(new JComboBox<>(new String[]{"Cash", "Credit"}));

        f.add(new JLabel("Coffee:"));
        f.add(new JTextField("Espresso", 10));

        f.add(new JLabel("Amount:"));
        f.add(new JSlider(0, 10, 1));

        f.add(new JButton("Calculate Total Price"));
        f.add(new JLabel("Total: $0.00"));

        f.pack();
        f.setVisible(true);
    }
}
