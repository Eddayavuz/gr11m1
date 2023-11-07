// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i = 0;
        Random rand = new Random();
        int randomNumber = 0;

        while(i<5){
            randomNumber = rand.nextInt(100);
            System.out.println(randomNumber);
            i++;
        }
        }
    }