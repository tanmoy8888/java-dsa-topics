package topics.arrays;

import java.util.Arrays;

public class BuiltInArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 6, 7, 1};

        /*Arrays.sort(arr);
        printArray(arr);*/

        Arrays.sort(arr,2,4);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
