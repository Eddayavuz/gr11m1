// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        // A while loop in Java is a control flow structure that repeatedly executes
        // a block of code as long as a specified condition is true. It has the following syntax:

        SYNTAX
        while (condition = boolean expression){
            //code to be executed
           Increment / decrement statement
        }
*/
        // write num on the console as long as num is smaller than 10.
       //int i = 1;
        //while (i<10){
         // System.out.println(i);
          //i++;
        //}


        //int i = 1;
        // Beware of infinite loops!!!
        //while (i<10){
          //  System.out.println(i);
        //}



        // let's write a small program to print out the numbers between two entered numbers.
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter the start number");
        int start = scanner.nextInt();
        System.out.println("enter the end number");
        int end = scanner.nextInt();

        while (start>=end){

            if (start%2 == 0) {
                System.out.println(start);
            }
            start--;
        }*/

        // let's modify this program to print out only the even numbers.
        //while (start <= end){
          //  if( start % 2 == 0){
            //System.out.println(start);
            //}
            //start++;
        //}
        // let's write a small program to add numbers from one to ten and print out the result.
       /*int num = 1;
       int sum = 0;
        while (num <= 10) {
          sum = sum + num;
          num++; // inc
       }
        System.out.println("Sum of numbers from 1 to 10: " + sum); // TRY: print the result inside the while loop.
*/

        // STRING MANIPULATION - Reverse String
        String name = "EDA";
        int len = name.length()-1; // 3
        // instead of printing out the letters one by one, we can create a new reversed string.
        // Then print that new string.

        while (len>=0){
            char character = name.charAt(len);
            System.out.println(character);
            len--;
        }

}
}