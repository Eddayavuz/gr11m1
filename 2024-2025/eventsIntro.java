import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventsIntro {

    public static void main(String[] args) {

       JFrame frame = new JFrame("clicker game");
       JLabel showCLicks = new JLabel("0");
       JButton clickButton = new JButton("click me");
       JButton resetButton = new JButton("reset");


       frame.setLayout(new GridLayout(3,1));
       frame.setSize(300,300);
       frame.add(showCLicks);
       frame.add(clickButton);
       frame.add(resetButton);

       frame.setVisible(true);

       clickButton.addActionListener(new ActionListener(){

           public void actionPerformed(ActionEvent e){
               int counter = Integer.parseInt(showCLicks.getText());
               counter++;
               showCLicks.setText(String.valueOf(counter));
           }
       });


/* TASK: Improve this game by adding another button to reset and to decrement the counter.
Your GUI should look like this:

------------
0            
|+| |-| |reset|
------------

*/
    }
}
