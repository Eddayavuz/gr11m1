import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* SYNTAX
       do {
            // Code to be executed
        } while (condition);

        */


        /* In Java, a "do-while" loop is a control structure that repeatedly executes a block of code as long as a specified condition is true.
        The key difference between a "do-while" loop and a "while" loop is that the "do-while" loop guarantees that the block of code will be
        executed at least once, as the condition is evaluated after the loop body.
         */

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        /* JAVA SIMPLE FOR LOOP

        for(initialization/condition; condition; increment/decrement){
            //statement or code to be executed

        1. Initialization: It is the initial condition which is executed once when the loop starts.
        Here, we can initialize the variable, or we can use an already initialized variable.

        2. Condition: It is the second condition which is executed each time to test the condition of the loop.
        It continues execution until the condition is false. It must return boolean value either true or false.

        3. Increment/Decrement: It increments or decrements the variable value.

        4. Statement: The statement of the loop is executed each time until the second condition is false.

*/

        // LET'S MAKE A PROGRAM TO PRINT OUT NUMBERS FROM 1 TO 10 in decreasing order
        for (int k = 10 ; k >= 0 ; k--){
            System.out.print(k + " ");
        }

        // LET'S MAKE A PROGRAM TO PRINT OUT NUMBERS FROM 1 TO 10 in increasing order
        System.out.println();
        for (int l = 0 ; l <= 10 ; l++){
            System.out.print(l + " ");
        }

        // LET'S MAKE A PROGRAM WHERE WE GIVE THE USER THE OPTION TO ENTER HOW MANY THEY WANT
        Scanner read = new Scanner(System.in);
        System.out.println("How many numbers you'd like to enter?");
        int n = read.nextInt();

        for (int m = 1; m <= n; m++){
            System.out.println("Enter the " + m + " number.");
            int number = read.nextInt();
        }

        // LET'S MAKE A PROGRAM TO COUNT THE 't's IN A TEXT
        String text = "Some Text";
        int counter = 0;
        for (int i = 0 ; i < text.length() ; i++){
            char letter = text.charAt(i);
            if (letter == 't'){
                counter++;
            }
        }
        System.out.println(" ts found: " + counter);

        }
    }
