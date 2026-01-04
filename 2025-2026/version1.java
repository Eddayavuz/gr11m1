import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Coffee System v0.1");
        f.setLayout(null); 
        f.getContentPane().setBackground(Color.YELLOW);

        JLabel nameL = new JLabel("NAME:");
        nameL.setForeground(Color.WHITE); 
        nameL.setBounds(10, 10, 50, 20);
        f.add(nameL);

        JTextField nameField = new JTextField();
        nameField.setBounds(60, 10, 30, 20); 
        f.add(nameField);

        JButton sizeS = new JButton("S"); sizeS.setBounds(10, 100, 45, 20);
        JButton sizeM = new JButton("M"); sizeM.setBounds(60, 100, 45, 20);
        JButton sizeL = new JButton("L"); sizeL.setBounds(110, 100, 45, 20);
        f.add(sizeS); f.add(sizeM); f.add(sizeL);

        JButton calc = new JButton("CALCULATE");
        calc.setBackground(Color.RED);
        calc.setBounds(200, 200, 150, 150);
        f.add(calc);

        f.setSize(400, 400);
        f.setVisible(true);
    }
}
