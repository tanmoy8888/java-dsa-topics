package topics.sorting.gfg;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/problems/key-pair5616/1
 * <p>
 * Two Sum - Pair with Given Sum
 */

public class TwoSum {
    public static void main(String[] args) {
       /* int[] arr = {0, -1, 2, -3, 1};
        int target = -2;*/
        int[] arr = {1, -2, 1, 0, 5};
        int target = 0;
        System.out.println("Output = " + twoSum(arr, target));
    }

    private static boolean twoSum(int arr[], int target) {
        boolean found = false;
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] < target) {
                start++;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else if (arr[start] + arr[end] == target) {
                found = true;
                break;
            } else {
                found = false;
                break;
            }
        }
        return found;
    }
}
