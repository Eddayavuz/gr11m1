import java.util.Scanner;

public static void main(String[] args) {
        Hangman hangmanGame = new Hangman("HANGMAN", 6);
        hangmanGame.playGame();
    }

public class Hangman {
    private String wordToGuess;
    private StringBuilder guessedWord;
    private int maxAttempts;
    private int attemptsLeft;

    // Constructor
    public Hangman(String wordToGuess, int maxAttempts) {
        this.wordToGuess = wordToGuess.toUpperCase();
        this.maxAttempts = maxAttempts;
        this.attemptsLeft = maxAttempts;
        initializeGuessedWord();
    }

    private void initializeGuessedWord() {
        guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0 && guessedWord.toString().contains("_")) {
            displayHangman();
            displayGuessedWord();

            System.out.println("Enter a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (isValidGuess(guess)) {
                updateGuessedWord(guess);
            } else {
                System.out.println("Invalid guess. Try again.");
            }
        }

        scanner.close();
        displayGameResult();
    }

    private void displayHangman() {
        // Implement a method to display the hangman visuals based on the attempts left
    }

    private void displayGuessedWord() {
        System.out.println("Guessed Word: " + guessedWord);
    }

    private boolean isValidGuess(char guess) {
        return Character.isLetter(guess) && !guessedWord.toString().contains(String.valueOf(guess));
    }

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
            }
        }

        if (!wordToGuess.contains(String.valueOf(guess))) {
            attemptsLeft--;
        }
    }

    private void displayGameResult() {
        if (guessedWord.toString().equals(wordToGuess)) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry! You ran out of attempts. The correct word was: " + wordToGuess);
        }
    }
}
