public class Main {
    public static void main(String[] args) {
    int[] array = {5,3,2,1,2,3,4};
    System.out.println(howMany(array, 2, array.length-1, 0));

    }
    public static int howMany(int[] arr, int target, int index, int count) {
        if (index < 0)
            return count;

        if(arr[index] == target)
            return count + 1 + howMany(arr, target, index-1, count);

        return howMany(arr, target, index-1, count);
    }
}
