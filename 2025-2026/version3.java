import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Star-Java Coffee Terminal");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // --- Customer Section ---
        JPanel custPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        custPanel.setBorder(BorderFactory.createTitledBorder("Customer Info"));
        custPanel.add(new JLabel("Name:"));
        custPanel.add(new JTextField(15));
        custPanel.add(new JLabel("Payment:"));
        custPanel.add(new JComboBox<>(new String[]{"Credit Card", "Digital Wallet", "Cash"}));

        gbc.gridx = 0; gbc.gridy = 0;
        mainPanel.add(custPanel, gbc);

        // --- Coffee Section ---
        JPanel coffeePanel = new JPanel(new GridLayout(3, 2, 5, 5));
        coffeePanel.setBorder(BorderFactory.createTitledBorder("Order Details"));
        coffeePanel.add(new JLabel("Coffee Type:"));
        coffeePanel.add(new JComboBox<>(new String[]{"Cappuccino", "Latte", "Macchiato"}));
        coffeePanel.add(new JLabel("Size (S/M/L):"));
        coffeePanel.add(new JComboBox<>(new String[]{"S", "M", "L"}));
        coffeePanel.add(new JLabel("Quantity:"));
        coffeePanel.add(new JSpinner(new SpinnerNumberModel(1, 1, 20, 1)));

        gbc.gridy = 1;
        mainPanel.add(coffeePanel, gbc);

        // --- Action Section ---
        JButton calcBtn = new JButton("Calculate & Place Order");
        calcBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        gbc.gridy = 2;
        mainPanel.add(calcBtn, gbc);

        f.add(mainPanel);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
