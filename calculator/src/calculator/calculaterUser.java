package calculator;

public class calculaterUser {

	public static void main(String[] args) {
		
		calculator cal = new calculator(3, 4); // create a calculator object called cal
		
		System.out.println(cal.getDiv()); // call getDiv() method
		System.out.println(cal.getMul()); // call getMul() method etc.
		System.out.println(cal.getSubs());
		System.out.println(cal.getSum());
	}
	
}
