import java.util.Scanner;

public class HasNextIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number:");

        // Check if the next input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered the number: " + number);
        } else {
            String invalidInput = scanner.next(); // Consume the invalid input
            System.out.println("Error: '" + invalidInput + "' is not a valid number.");
        }
    }
}
