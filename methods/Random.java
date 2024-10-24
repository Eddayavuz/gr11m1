import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i = 0;
        Random rand = new Random(); // create random object.
        int randomNumber = 0;

        while(i<5){
            randomNumber = rand.nextInt(100) + 1; // generate a random number within a range.
            System.out.println(randomNumber); 
            i++;
        }
        }
    }
