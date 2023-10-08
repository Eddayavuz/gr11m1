package conditionals;
import java.util.Scanner;

public class switchCase {
	
	public static void main(String[] args) {		
		
	/* In the switch statement, we compare the condition value with multiple cases. 
	 * When there is a match with any one of the cases, the block of code corresponding with that case is executed. 
	 * Each case has a name or a number, which is known as its identifier. 
	 * If none of the cases matches the condition, the block of code corresponding to the default case is executed. 
	 * 

		
		// SWITCH-CASE SYNTAX
		
		/* 
		switch(expression) {
		  case x:
		    // code block
		    break;
		  case y:
		    // code block
		    break;
		  default:
		    // code block
		} 
		
		* Question: The meaning of break keyword?
		
		
		* DIFFERENCE BETWEEN IF-ELSE AND SWITCH-CASE
		 * 
		 * A switch statement is significantly faster than an if-else ladder if there are many nested if-else's involved. 
		 * This is due to the creation of a jump table for switch during compilation. 
		 * As a result, instead of checking which case is satisfied throughout execution, it just decides which case must be completed. 
		 * The number of comparisons made is lesser hence, reducing the compile time. 
		 * Hence, the switch would work better while selecting from a large set of values. */
		
		
		// LET'S MAKE A SMALL PROGRAM FOR A NAVIGATION MENU
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please choose a menu");
		System.out.println("1. Home");
		System.out.println("2. Calculator");
		System.out.println("3. Guessing game");
		
		byte choice = read.nextByte();
		
		switch (choice) { 
		
		case 1:
			System.out.println("Welcome to Home Page");
			break;
		case 2: 
			System.out.println("Welcome to Calculator");
			break;
		case 3:
			System.out.println("Welcome to Guessing Game");
			break;
		default:
			System.out.println("Invalid input");
		}
		
		//Now, try deleting one of the breaks and let me know your conclusion.

		
		// LET'S MAKE ANOTHER SMALL PROGRAM TO CHECK WHICH MONTHS IN A YEAR HAS HOW MANY DAYS.
		int month = 2;
		int year = 2020;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        
        System.out.println("Number of Days = " + numDays);
		}
	}