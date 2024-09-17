package casting;

public class casting {
	
	public static void main(String[]args) {
		// Casting to an int chops off the decimal, rather than rounding
        // to the nearest int.
        int doubleCastedToInt = (int) 10.9 ;
        System.out.println("Casting to an int: ");
        System.out.println("(int) 10.9 = " + doubleCastedToInt);
        System.out.println();
        
        // Casting takes place before any arithmetic operations
        // like addition, subtraction, multiplication, division, modulus
        // But parentheses take precendence over all.
        double castNumerator = (double) 2 / 3;
        System.out.println("Casting numerator: ");
        System.out.println("(double) 2 / 3 = " + castNumerator);
        System.out.println();
        
        double castDenominator = 2 / (double) 3;
        System.out.println("Casting denominator: ");
        System.out.println("2 / (double) 3 = " + castDenominator);
        System.out.println();
        
        double castNeither = 2 / 3;
        System.out.println("Casting neither (integer division): ");
        System.out.println("2 / 3 = " + castNeither);
        System.out.println();
        
        double castOutsideOfParentheses = (double) (2 / 3);
        System.out.println("Casting outside of parentheses: ");
        System.out.println("(double) (2 / 3) = " + castOutsideOfParentheses);
        System.out.println();
        
        // This casts the 5, which results in
        // 5.0 + 2 / 3. The integer division happens first, resulting in
        // 5.0 + 0 = 5.0
        double castWrongElement = (double) 5 + 2 / 3;
        System.out.println("Casting the 5...\n2 / 3 is unaffected by cast (be careful):");
        System.out.println("(double) 5 + 2 / 3 = " + castWrongElement);
        System.out.println();
        
        // This casts the 2, which results in
        // 5 + 2.0 / 3. The division will be double division, resulting in
        // 5 + 0.6666 = 5.6666
        double castCorrectElement = 5 + (double) 2 / 3;
        System.out.println("Cast happens before the division here:");
        System.out.println("5 + (double) 2 / 3 = " + castCorrectElement);
        System.out.println();
        
        
        
        // ROUNDING
        
        double value1 = 10.0;
        double value2 = 10.3;
        double value3 = 10.5;
        double value4 = 10.7;
        double value5 = 10.9;
        double value6 = 11.1;
        
        int rounded1 = (int) (value1 + 0.5);
        int rounded2 = (int) (value2 + 0.5);
        int rounded3 = (int) (value3 + 0.5);
        int rounded4 = (int) (value4 + 0.5);
        int rounded5 = (int) (value5 + 0.5);
        int rounded6 = (int) (value6 + 0.5);
        
        System.out.println("Adding 0.5 then casting to an int will round to the\n" + 
                            "nearest int.\n" +
                            "If the decimal is 0.5 or greater, this will round up.\n" +
                            "If the decimal is less than 0.5, this will round down\n" +
                            "Can you determine why?");
        
        System.out.println(value1 + " rounded = " + rounded1);
        System.out.println(value2 + " rounded = " + rounded2);
        System.out.println(value3 + " rounded = " + rounded3);
        System.out.println(value4 + " rounded = " + rounded4);
        System.out.println(value5 + " rounded = " + rounded5);
        System.out.println(value6 + " rounded = " + rounded6);
        
	}

}
