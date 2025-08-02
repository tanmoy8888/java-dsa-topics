package topics.arrays;

public class TwoSum {
    public static void main(String[] args) {
       // int[] arr = {1, 2, 3, 4, 5, 6};
       // int target = 6;
        int [] arr ={1 ,-2, 1, 0, 5};
        int target = 0;
        System.out.println("Output = " + twoSum(arr, target));
    }

    private static boolean twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }
}
