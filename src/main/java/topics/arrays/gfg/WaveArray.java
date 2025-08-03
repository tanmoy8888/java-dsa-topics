package topics.arrays.gfg;

import java.util.Arrays;

/**
 * GFG : Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place).
 * In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on.
 * If there are multiple solutions, find the lexicographically smallest one.
 * <p>
 * Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.
 */
public class WaveArray {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {2, 4, 7, 8, 9, 10};
        int[] arr = {1, 8, 10, 14};
        sortInWave(arr);
    }

    public static void sortInWave(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while (start < end) {
            if (arr[start] < arr[start + 1]) {
                temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            start += 2;
        }
        System.out.println("Output = " + Arrays.toString(arr));
    }
}
