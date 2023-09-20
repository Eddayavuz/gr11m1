package testProject;

public class testProgram {
	
	public static void main(String[] args) {
	
		int candyBars = 20;
		int friends = 5;
		
		System.out.println("What is the width of the rectangle?: " + candyBars);
		System.out.println("Candy bars: " + friends);
		
		int candyBarsPerPerson = candyBars/friends;
		System.out.println("Candy bar per person: " + candyBarsPerPerson);
		
		// what would the result be?
		
		friends++;
		System.out.println("Candy bars: " + candyBars);
		System.out.println("Candy bars: " + friends);
		
		candyBarsPerPerson = candyBars/friends;
		System.out.println("Candy bar per person: " + candyBarsPerPerson);
		
		//What would the result be?

	}
}


