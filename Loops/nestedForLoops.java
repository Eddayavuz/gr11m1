// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /*  NESTED FOR LOOPS
       A nested for loop is a loop inside another loop
       This allows you to iterate over elements in a two-dimensional structure, or perform repetitive tasks in a nested manner.
       The syntax for a nested for loop looks like this:

       for (initialization1; condition1; update1) {
    // code block 1
    for (initialization2; condition2; update2) {
        // code block 2
    }
}
        LET'S MAKE AN EXAMPLE OF A MULTIPLICATION TABLE */

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x ");
                System.out.println(j + " = " + i * j);
            }
            System.out.println();
        }

        /* THIS TIME, LET'S CREATE A SIMPLE PROGRAM THAT PRINTS A SQUARE PATTERN OF NUMBERS: */
        int row = 3;
        for (int m = 0; m <= row; m++) {
            for (int n = 0; n <= row; n++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        /* LET'S MAKE ANOTHER EXAMPLE NOW THAT PRINTS OUT AN ASTERISK TRIANGLE - WITH A RIGHT ANGLE */

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("*");
            }
            System.out.println();
            numberPyramid(4);
        }
    }
    public static void numberPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
