import java.util.Scanner;
import java.util.Random;

public class diceGame {
    public static void main(String[] args) {

        int dice = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("\u001B[33m"+"Welcome to multiplayer dice game");
        System.out.println("\u001B[33m"+"*********************");

        System.out.println("\u001B[0m"+"enter player 1 name: ");
        Players p1 = new Players(read.nextLine());
        System.out.println("enter player 2 name: ");
        Players p2 = new Players(read.nextLine());

        System.out.println("how many rounds you'd like to play: ");
        int rounds = read.nextInt();
        read.nextLine(); // with nextInt() scanner only reads integer. when we press enter it leaves leftover.
        // That's why we read the nextLine() and do nothing with it. This is to avoid skipping upcoming nextLine() methods.

        for (int i = 1; i <= rounds; i++) {
            System.out.println("***********");
            System.out.println("Round " + i);
            System.out.println("***********");

            System.out.println(p1.getPlayerName() + " press enter to roll the dice");
            read.nextLine();
            dice = p1.diceRoll();
            p1.addScore(dice);
            System.out.println("\u001B[31m"+"you got: " + dice +  " and your total score is: " + p1.getScore()+"\u001B[0m");

            System.out.println(p2.getPlayerName() + " press enter to roll the dice");
            read.nextLine();
            dice = p2.diceRoll();
            p2.addScore(dice);
            System.out.println("\u001B[31m"+"you got: " + dice  + " and your total score is: " + p2.getScore()+"\u001B[0m");

        }
        if (p1.getScore() > p2.getScore()) {
            System.out.println("\u001B[32m" + p1.getPlayerName() + " wins with the score: " + p1.getScore()) ;
        } else if (p1.getScore() == p2.getScore()) {
            System.out.println("\u001B[32m" + "it's a tie!");
        } else {
            System.out.println("\u001B[32m" + p2.getPlayerName() + " wins with the score: " + p2.getScore());
        }
    }
}

    class Players {
        private String name;
        private int score = 0;

        public Players(String name) {
            this.name = name;
        }
        void addScore(int score) {
            this.score += score;
        }
        String getPlayerName() {
            return this.name;
        }
        int getScore() {
            return this.score;
        }
        int diceRoll() {
            Random rnd = new Random();
            return rnd.nextInt(5) + 1;
        }
    }
