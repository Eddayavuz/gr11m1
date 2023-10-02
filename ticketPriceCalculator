package ticketDiscountCalculator;
import java.util.Scanner; // IMPORT SCANNER CLASS

public class version_one {
	
	public static void main(String[] args) {
		
		// MAKE A PROGRAM THAT CALCULATES THE DISCOUNT FOR TICKET PRICE OF A MOVIE THEATER
		/*
		    If the user is under 12 years old, the ticket price is $7.
			If the user is 12 years old or older but under 18 years old, and the movie is before 1700 (5:00 PM), the ticket price is $8.
			If the user is 12 years old or older but under 18 years old, and the movie is at or after 1700 (5:00 PM), the ticket price is $10.
			If the user is 18 years old or older, the ticket price is $12.
		 */
		
		
		// CREATE A SCANNER OBJECT
		
		Scanner read = new Scanner(System.in);
		
		// GET INFO FROM THE USER
		System.out.println("What is your age?");
		int age = read.nextInt();
		System.out.println("What is the time of the movie?");
		int time = read.nextInt();
		
		// DECLARE PRICE
		int price = 12;
		
		if (age < 12) {
			price = 7;
		}
		else if (age>=12 && age<18) {
			if (time <= 1700) {
				price = 8;
			}
			else
			{
				price = 10;	
			}
		}
		else
		{
			price = 12;
		}
		
		System.out.println("The price of the ticket is $" + price);
	}

}
