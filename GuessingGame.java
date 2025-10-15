import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");

        String input;
        do {
            System.out.println("I'm thinking of a number between 1 and 10.");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                guessGame(guess);
                input = " ";
            }else{
                input = scanner.next();
            }
        } while (!input.equals("quit"));
        System.out.println("bye then!");


    }

    public static void guessGame(int guess) {

        int secretNumber = (int) (Math.random() * 9 + 1);
        int attempts = 0;

        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed the secret number " + secretNumber + " in " + attempts + " attempts.");
        } else if (guess < secretNumber) {
            System.out.println("Try a higher number.");
        } else {
            System.out.println("Try a lower number.");
        }

    }
}
