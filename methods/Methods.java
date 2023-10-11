package methods;

/*
 * What Is a Method?

A method is like a mini-program inside your main program.
It's a set of instructions that perform a specific job.

A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). 
Java provides some pre-defined methods, such as System.out.println(), 
but you can also create your own methods to perform certain actions

Why Use Methods?

Methods help you break your program into smaller, manageable parts.
They make your code more organized, easier to understand, and easier to maintain.
You can reuse the same method in different parts of your program.

Basic Structure:

A method has a name that you choose (e.g., calculateArea).
It can take input values (parameters) and can return a result.
It contains a block of code enclosed in {}.

Calling a Method:

To use a method, you call it by its name.
You can pass values to the method (if it accepts parameters).
You can use the result returned by the method (if it has a return type).


LET'S MAKE A SIMPLE PROGRAM THAT CREATES AND CALLS A METHOD.

*/

public class Methods {
	
	// CREATE A METHOD
	
	/* myMethod(): is the name of the method 
	 * 
	 * static: means that the method belongs to the Main class and not an object of the Main class. 
	 * You will learn more about objects and how to access methods through objects later in course.
	 * 
	 * void: means that this method does not have a return value. 
	 * You will learn more about return values later in this course*/

	public static void sayHello() {
        System.out.println("Hello, World!");
    }
	
	public static void main(String [] args) {
		
	/* CALL A METHOD
		To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
		In the following example, sayHello() is used to print a text (the action), when it is called */
		
		sayHello(); // call sayHello() method
		
		greetWithName("Eda"); // call greetWithName() method
		
		greetNameAge ("Eda", 30); // call greetNameAge() method
		
		int square = getSquare(3);
		
		System.out.println("The square of 3 is " + square);
		
	} 
	 
	 /* Parameters and Arguments
	  * Information can be passed to methods as parameter. Parameters act as variables inside the method.
	  * Parameters are specified after the method name, inside the parentheses. 
	  * You can add as many parameters as you want, just separate them with a comma.
	  * The following example has a method that takes a String called userName as parameter. 
	  * When the method is called, we pass along a first name, 
	  * which is used inside the method to print the full name:

	  * */
	 
	 public static void greetWithName(String userName) {
	        System.out.println("Hello " + userName);
	    }
	 
	 /* Multiple Parameters
	  * You can have as many parameters as you like: */
	 
	 public static void greetNameAge (String uName, int uAge ) {
		 System.out.println ("Hello " + uName + " Age: " + uAge);
	 }
	 
	/* Return Values
	 * The void keyword, used in the examples above, indicates that the method should not return a value. 
	 * If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) 
	 * instead of void, and use the return keyword inside the method:*/
	 
	 static int getSquare(int x) {
		 
		 return x*x;
		 
	 }
}


