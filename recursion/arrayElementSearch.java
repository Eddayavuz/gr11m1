/*
Write a Java program to implement a recursive element search method.
The method should take three parameters: a target element, an integer array, and the current index for the search.
The goal is to determine whether the target element is present in the array by recursively checking each element starting from the last index.
*/

public class arrayElementSearch {
    public static void main(String[] args) {
        int[] arr = {5,4,0,7,3,82,34,12};
        System.out.println(elementSearch(5, arr, arr.length-1));
    }

    public static boolean elementSearch(int target, int[] array, int index){

        // base case 1
        if (index < 0) {
            return false;
        }
        // base case 2
        if (index >= array.length){
            return false;
        }
        // base case 3
        if(array[index] == target){
            return true;
        }
        return elementSearch(target, array, index-1);
    }
}
