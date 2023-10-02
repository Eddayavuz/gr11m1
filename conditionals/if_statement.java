package conditionals;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		    
		// COMPARISON OPERATORS
		
		// EQUAL ==
		// NOT EQUAL !=
		// LESS THAN <
		// GREATER THAN >
		// LESS THAN OR EQUAL <=
		// GREATER THAN OR EQUAL >=
		
		// WE CAN USE THESE COMPARISON OPERATORS TO COMPARE PRIMITIVE DATA TYPES (INT, BOOLEAN, DOUBLE AND CHAR). NOT STRINGS!!
		
		int i = 10;
		int j = 15;
		boolean greater;
		
		greater = i < j;
		
		System.out.println("Is it greater ? : " + greater);
		
		
		// LOGICAL OPERATORS
		
		// NOT !
		// OR  ||
		// AND &&
		
		
		// THE USE OF ! (NOT) OPERATOR
		boolean lightOn = true;
		System.out.println("Light on?: " + lightOn);
		lightOn = !lightOn;
		System.out.println("Light on?: " + lightOn);	
		
		// THE USE OF && (AND) OPERATOR
		int grade = 83;
		boolean gotB = grade>=80 && grade<90;
		
		System.out.println("Did you get B?: " + gotB);
		
		
	
		// IF STATEMENT
		
		/* 
		if (boolean expression) {
			//code to execute only if the expression is true
		}
		*/
		
		// LET'S TRY THIS WITH THE LIGHT ON EXPRESSION
		
		if (lightOn) {
			System.out.println("It's bright!");
		}
		
		// LET'S MAKE ANOTHER PROGRAM TO CHECK IF SOMEONE IS ABLE TO RIDE A ROLLER COASTER
		
		int heightInCm = 160;
		boolean canRide = heightInCm > 155;
		
		if (canRide) {
			System.out.println("Yay! You can ride a roller coaster!");
		}
		
		// IF/ELSE STATEMENT
		
		/* 
		if (boolean expression) {
			code to execute only if the boolean expression is true
		}
		else 
		{
			code to execute only if the boolean expression is false
		}
		*/
		
		// LET'S MODIFY THE ROLLER COASTER EXAMPLE

		if (canRide) {
			System.out.println("Yay! You can ride a roller coaster!");
		}
		else 
		{
			System.out.println("Sorry :( You can not ride a roller coaster");
		}
		
		// LET'S MAKE ANOTHER SMALL PROGRAM TO CHECK IF A NUMBER IS NEGATIVE OR POSITIVE
		
		int number = 0;
		
		if (number < 0) 
		{
			System.out.println("The number is negative");
		}
		else 
		{
			System.out.println("The number is positive");
		}
		
		// ANOTHER EXAMPLE TO FIND IF A NUMBER IS EVEN OR ODD
		
		if (number % 2 == 0) 
		{
			System.out.println("The number is even");
		}
		else 
		{
			System.out.println("The number is odd");
		}
		
		
		// IF/ELSE/ELSE IF STATEMENT
		
		/* 
		if (boolean expression one) {
			code to execute only if the boolean expression one is true
		}
		else if (boolean expression two)
		{
			code to execute only if the boolean expression two is true
		}
		else
		{
			code to execute only if neither boolean expression is true
		}
		*/
		
		// LET'S MODIFY OUR NEGATIVE/POSITIVE PROGRAM BECAUSE THE NUMBER CAN BE 0 WHICH IS NEITHER NEGATIVE OR POSITIVE
		
		int num1 = 0;
		
		if (num1 < 0) 
		{
			System.out.println("The number is negative");
		}
		else if (num1 > 1)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is ZERO");
		}
		
		
		// LET'S MAKE A PROGRAM THAT YOU WILL ENCOUNTER IN A REAL LIFE SCENERIO
		
		// BUT LET'S CREATE ANOTHER PROJECT FOR THIS.
		
		
		
		}
	}
	
