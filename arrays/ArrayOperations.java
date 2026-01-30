public class ArrayOperations {

    public static void main(String[] args) {

        // An integer array with 8 elements
        int[] arr = {40, 21, 42, 53, 12, 14, 9, 21};

        System.out.println(numberFinder(53, arr));
        System.out.println(sumOfItems(arr));
        createOddArray(10);
        System.out.println(findMax(arr));
        System.out.println(calculateAverage(arr));
        System.out.println(countEvenNumbers(arr));
    }

    /* Let's write a method that searches for a specific number in the array
      Returns true if found, false otherwise || What type of method would that be? */
    public static boolean numberFinder(int num, int[] array) {

        // To do that, we will write a for loop to iterate through the array items one by one
        // and check if any item equals the number I'm looking for.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true; // stop immediately when found
            }
        }
        return false; // number not found
    }

    // Finds and returns the maximum value in the array
    public static int findMax(int[] array) {

        // Start by assuming the first element is the maximum
        int max = array[0];

        // Compare each element with the current maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // update max if a bigger value is found
            }
        }
        return max;
    }

    /* Let's write a method that creates an array filled with odd numbers to an upper bound and prints it
       What type of method would that be?
       What should my approach be? */
    public static void createOddArray(int size) {

        int[] oddArray = new int[size]; // array to store odd numbers
        int oddNumber = 1; // first odd number

        // Fill the array with odd numbers
        for (int i = 0; i < size; i++) {
            oddArray[i] = oddNumber;
            oddNumber += 2; // move to the next odd number
        }

        // Print the array contents
        System.out.print("Odd Array: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}
