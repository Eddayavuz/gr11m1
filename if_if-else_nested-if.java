package conditionals;

public class Demo {
	
	public static void main(String[] args) {
		
	
		
		// IF STATEMENT
		
		int i = 10;
		int j = 15;
		
		if (i < 15) // if the condition is true
		{
			System.out.println("This will be shown only if i is greater than 15 (the statement is true)");// do this.
		}
		System.out.println("This will be shown everytime");// do this regardless
		
		// What would happen if I delete the curly brackets? 
		
		// Most of the times, programmers skip the curly brackets. In this case, you should know that
		// The next line after the if, will be shown if the statement is true.
		
		if (i < 15 ) // if the condition is true
			System.out.println("This will be shown only if i is greater than 15 (the statement is true)");//do this
			System.out.println("This will be shown everytime");// do this second line whether the condition is true or false
		
		//  So now we are able to make our program DO something if the statement is true.
		//  But currently do we have any power of making our program do something else if the statement is false?

		// To have this power: Introducing...
			
		// IF-ELSE STATEMENT
		
		if(i < j) 
		{
			System.out.println(i + " is less than " + j);
		}
		else
		{
			System.out.println(i + " is greater than " + j);
		}
		
		
		// What if we have a third condition? Like i is equals to j?
		// then we simply modify our if-else statement.
		
		if(i < j) 
		{
			System.out.println(i + " is less than " + j);
		}
		else if (i > j)
		{
			System.out.println(i + " is greater than " + j);
		}
		else {
			System.out.println("both numbers are equal");
		}		

		// There's another way to write the same program with less code. It's possible with the logical operators
		// we use && to add another statement in the condition.

		// let's write a small program that convert student's grade into a letter format.

		int grade = 49; 

		if (grade <= 100 && grade >= 90) {
			System.out.println("You got A");
		}
		else if (grade <= 89 && grade >= 70) {
			System.out.println("You got B");
		}
		else if (grade <= 69 && grade >= 50) {
			System.out.println("You got C");
		}
		else {
			System.out.println("You got D");
		}
		
		
		// NESTED-IF
		
		int x = 10; // declare x
        	int y = 5; // declare y

        if (x > y) { // check if x is greater than y
            System.out.println(x + " is greater than " + y); // do this if the statement is true.

            if (x % 2 == 0) { // check if x's mod is equals to zero and thus is even number.
                System.out.println(x + " is even."); // if true show this.
            } else {
                System.out.println(x + " is odd."); // if false show this
            }
        } else {
            System.out.println(x + " is not greater than y."); // if the first statement is false, do this.
        }
		
		
		// What if we would like to check something else within our current if statement?
		// Let's take a look at a simplified real-life use.
		// Let's say technomarket has a %20 discount for students  
		// It also has a %30 special offer for the first purchase online.
		
		// Let's make a program to apply the discounts to the price
		
		int price = 100;
		boolean isStudent = true;
		boolean isSpecialOffer = false; 
		
		if (isStudent) {
			System.out.println("Student discount applied");
			if (isSpecialOffer) {
				System.out.println("Special offer discount applied");
				System.out.println("Final price is" + (price * 0.5)); // Apply both discounts
			}
			else {
				System.out.println("Final price is" + (price * 0.8)); // Only student discount applied
			}
		}
		else {
			System.out.println("No Discount Applied.");
            System.out.println("Final Price: $" + price); // No discounts applied
			}
	}

	}
