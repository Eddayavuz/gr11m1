import java.util.*;

public class Main {

    public static void main(String[] args) {
    spellChecker checker = new spellChecker();

        System.out.print("Enter a word to spell check or q to quit: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        while (!word.equals("q")) {
            if (checker.linearSpellCheck(word))
                System.out.println(word + " is spelled correctly!");
            else
                System.out.println(word + " is misspelled!");
            System.out.print("Enter a word to spell check or q to quit: ");
            word = scan.nextLine();
        }
    }
}
