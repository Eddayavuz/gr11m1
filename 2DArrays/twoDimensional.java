public class twoDimensional {
    public static void main(String[] args) {
        // Create a 10x10 2D array
        int[][] numbers = new int[10][10];

        // Call autofill to populate the array, then display the filled array
        display(autofill(numbers));
    }

    // Method to fill the 2D array with sequential numbers starting from 0
    public static int[][] autofill(int[][] arr){
        int counter = 0; // Variable to keep track of the current number
        // Loop through each row of the 2D array
        for(int i = 0; i < arr.length ; i++){
            // Loop through each column of the current row
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = counter; // Assign the current counter value to the array element
                counter++; // Increment the counter for the next value
            }
        }
        return arr; // Return the filled array
    }

    // Method to display the 2D array in a readable format
    public static void display(int[][] arr){
        // Loop through each row of the array
        for (int[] row : arr){
            // Loop through each item in the current row
            for(int item: row){
                System.out.print(item + " "); // Print the item followed by a space (on the same line)
            }
            System.out.println(); // Move to the next line after printing all items in the current row
        }
    }
}
