import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorGUI{

    public static void main(String[] args) {
// A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("My app");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3,1)); // grid layout will divide the frame by rows and columns

// THE FIRST PANEL WHERE WE KEEP OUR TEXTBOXES
        JPanel textPanel = new JPanel(new FlowLayout());
        JTextField textBox1 = new JTextField(8);
        JTextField textBox2 = new JTextField(8);
        textPanel.add(textBox1);
        textPanel.add(textBox2);
        frame.add(textPanel);

// THE SECOND PANEL WHERE WE KEEP OUR BUTTONS
        JPanel buttonPanel = new JPanel(new GridLayout(1,4));
       JButton plus = new JButton("+");
       JButton minus = new JButton("-");
       JButton x = new JButton("x");
       JButton slash = new JButton("/");
       buttonStyle(plus);
       buttonStyle(minus);
       buttonStyle(x);
       buttonStyle(slash);
       buttonPanel.add(plus);
       buttonPanel.add(minus);
       buttonPanel.add(x);
       buttonPanel.add(slash);
       frame.add(buttonPanel);

// THE THIRD PANEL WHERE WE KEEP OUR RESULT LABEL
        JPanel resultPanel = new JPanel(new FlowLayout());
        JLabel result = new JLabel("Result: ");
        resultPanel.add(result);
        frame.add(resultPanel);

        frame.setVisible(true);

// WE CALL THE addActionListener METHOD WITH A NEW ActionListener OBJECT
// WITHIN THE ActionListener CLASS THERE IS A METHOD CALLED actionPerformed.
// WE OVERRIDE THIS METHOD FOR OUR BUTTON'S PURPOSE.

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               buttonClicked('+', textBox1, textBox2, result);
            }
        });

        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('-', textBox1, textBox2, result);
            }
        });

        slash.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('/', textBox1, textBox2, result);
            }
        });

        x.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('*', textBox1, textBox2, result);
            }
        });


    }
    public static void buttonClicked(char operator, JTextField textbox1, JTextField textbox2, JLabel result)
    {
                double num1 = Double.parseDouble(textbox1.getText());
                double num2 = Double.parseDouble(textbox2.getText());
                switch(operator){
                    case '+':
                        result.setText(String.valueOf(num1 + num2));
                        break;
                    case '-':
                        result.setText(String.valueOf(num1 - num2));
                        break;
                    case '/':
                        if(num2!=0){
                        result.setText(String.valueOf(num1 / num2));
                        }else{result.setText("can't divide by zero");
                        }
                        break;
                    case '*':
                        result.setText(String.valueOf(num1 * num2));
                        break;
                }

            }

    //A METHOD TO CHANGE THE STYLE OF THE BUTTONS.
    public static void buttonStyle(JButton button){
        button.setFont(new Font("Arial", Font.BOLD, 32));
        button.setForeground(Color.BLUE);
    }

}
