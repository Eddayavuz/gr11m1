public class stringAndMathClasses {
    public static void main(String[] args) {

        // STRING METHODS
        String text = "Informatics";

        System.out.println("Length: " + text.length());
        System.out.println("Substring (0,4): " + text.substring(2, 4));
        System.out.println("Equals 'informatics': " + text.equals("informatics"));
        System.out.println("CompareTo 'Info': " + text.compareTo("Info"));


        // MATH METHODS
        System.out.println("Power 2^3: " + Math.pow(2, 3));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Random number (0-1): " + Math.random());

        // HOW CAN WE SIMULATE DICE ROLL?

    }
}




