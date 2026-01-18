package dsa_by_pattern._02_sliding_window.gfg;

/**
 * GFG : https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
 * <p>
 * Max Sum Subarray of size K
 * Difficulty: EasyAccuracy: 49.6%Submissions: 246K+Points: 2
 * Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
 * <p>
 * Note: A subarray is a contiguous part of any given array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [100, 200, 300, 400], k = 2
 * Output: 700
 * Explanation: arr2 + arr3 = 700, which is maximum.
 * Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
 * Output: 39
 * Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
 * Input: arr[] = [100, 200, 300, 400], k = 1
 * Output: 400
 * Explanation: arr3 = 400, which is maximum.
 * Constraints:
 * 1 ≤ arr.size() ≤ 106
 * 1 ≤ arr[i] ≤ 106
 * 1 ≤ k ≤ arr.size()
 */

public class _01_MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
       /* int[] arr = {100, 200, 300, 400};
        int k = 2;
        */
        //int k = 1;
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println("maxSubarraySum(arr,k) = " + maxSubarraySum(arr, k));
    }

    public static int maxSubarraySum(int[] arr, int k) {
        int low = 0;
        int high = k - 1;
        int sum = 0;
        int max_sum = 0;
        for (int i = 0; i <= high; i++) {
            sum = sum + arr[i];
        }
        while (high < arr.length) {
            max_sum = Math.max(max_sum, sum);
            low++;
            high++;
            if (high == arr.length) break;
            sum = sum - arr[low - 1];
            sum = sum + arr[high];
        }
        return max_sum;
    }
}
