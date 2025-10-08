import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AllTypes {

    public static void main (String[] args) {
        // 1. Write a program that asks the user for a number n and prints the sum of all numbers from 1 to n.

        Scanner read = new Scanner(System.in);
        System.out.println("enter a number");
        int n = read.nextInt();

        int sum = 0;
        for (int i = 0; i < n ; i++){
            sum = sum + i;
        }
        System.out.println("the sum of all the numbers until " + n + " is " + sum);

        /* 2. Set a secret number (e.g., 7).
              Ask the user to guess it until they enter the correct number.
              When the user guesses correctly, print "You got it!". */

        int secret = 7;
        int guess = 0;
        while(guess != 7){
            System.out.println("I'm thinking of a number... guess?");
            guess = read.nextInt();
        }
        System.out.println("you got it!");

        /* 3.Ask the user to enter a positive number.
           If they enter a negative number, show a warning and ask again.
           Repeat until a positive number is entered. */

        System.out.println("Enter your age");
        int age = 0;
        do{
            age = read.nextInt();
            if(age<0) System.out.println("age is invalid, try again!");
        }while(age<0);
        System.out.println("age is valid!");
    }
}







