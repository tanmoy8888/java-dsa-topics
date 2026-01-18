package dsa_by_pattern.two_pointer.gfg;

import java.util.Arrays;

public class TripletsWithSmallerSum {
    public static void main(String[] args) {
        int n = 4;
        int sum = 2;
        long[] arr = {-2, 0, 1, 3};
        System.out.println("countTriplets(n,sum,arr) = " + countTriplets(n, sum, arr));
    }

    private static long countTriplets(int n, int sum, long arr[]) {
        long value = 0;
        long count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                value = arr[i] + arr[left] + arr[right];
                if (value >= sum) {
                    right--;
                } else {
                    count = count + (right - left);
                    left++;
                }
            }
        }
        return count;
    }
}
