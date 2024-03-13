
/*
Write a Java method to calculate the result of raising a given base to the power of an exponent using recursion.
Test your method in your main method using the values below:
int base = 2;
int exponent = 5;
*/

public class PowerCalculation {

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);
        System.out.println(result);
    }

    public static int calculatePower(int base, int exponent) {
        // Base Case
        if (exponent == 0) {
            return 1;
        }

        // Recursive Call
        return base * calculatePower(base, exponent - 1);
    }
}
