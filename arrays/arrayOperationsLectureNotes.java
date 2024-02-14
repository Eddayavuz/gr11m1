public class arrayOperationsLectureNotes {
    public static void main(String[] args) {

        // 1. FINDING THE BIGGEST NUMBER IN ARRAY
        int[] arr = {40,21,42,53,12,14,9};
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        // 2. FINDING THE AVERAGE OF ARRAY
        int[] arr2 = {40,21,42,53,12,14,9};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++){
           sum += arr2[i];
        }
        System.out.println(sum/arr2.length);

        // 3. COUNTING EVEN NUMBERS IN ARRAY
        int[] arr3 = {40,21,42,53,12,14,9};
        int count = 0;
        for (int i = 0; i < arr3.length; i++){
            if(arr[i]%2 == 0)
                count++;
        }
        System.out.println(count);

        // 4. FINDING DUPLICATES
        int[] arr4 = {40,21,42,53,46,65,40};
        boolean hasDuplicate = false;
        for (int i=0; i<arr4.length; i++){
            for (int j=0; j<i; j++){
                if (arr4[i] == arr4[j])
                    hasDuplicate = true;
            }
        }
        System.out.println(hasDuplicate);
    }
}
