/*

ARRAYS Class can do many things:
        Sorting arrays using Arrays.sort().
        Searching for an element in a sorted array using Arrays.binarySearch().
        Filling arrays with a specific value using Arrays.fill().
        Comparing arrays for equality using Arrays.equals().
        Copying arrays using Arrays.copyOf().
 */

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // Initializing an array
        int[] numbers = {5, 2, 8, 1, 3};

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary search in the sorted array
        int searchKey = 8;
        int index = Arrays.binarySearch(numbers, searchKey);
        if (index >= 0) {
            System.out.println("Found " + searchKey + " at index " + index);
        } else {
            System.out.println(searchKey + " not found in the array.");
        }

        // Filling the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Array filled with 10s: " + Arrays.toString(filledArray));

        // Comparing arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        System.out.println("Array1 equals Array2: " + Arrays.equals(array1, array2));
        System.out.println("Array1 equals Array3: " + Arrays.equals(array1, array3));

        // Copying arrays
        int[] originalArray = {1, 2, 3};
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // BONUS: Turning String into char array
        String text = "coffee";
        char[] charArray = text.toCharArray();
    }
}
