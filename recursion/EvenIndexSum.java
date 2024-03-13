
/*
Create a method that calculates the sum of even-indexed elements in an integer array using recursion.
Test your method by calling it in your main method after the initialization of this array: int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
*/

public class EvenIndexSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = calculateEvenIndexSum(array, 0);

        System.out.println(result);
    }

    public static int calculateEvenIndexSum(int[] nums, int index) {
        // Base Case
        if (index >= nums.length) {
            return 0;
        }

        // Recursive Call
        return nums[index] + calculateEvenIndexSum(nums, index + 2);
    }
}
