public class twoDimensional {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];

        display(autofill(numbers));

    }

    public static int[][] autofill (int[][] arr){
        int counter = 0;
        for(int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = counter;
                counter++;
            }
        }
        return arr;
    }

    public static void display(int[][] arr){
        for (int[] row : arr){
            for(int item: row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
