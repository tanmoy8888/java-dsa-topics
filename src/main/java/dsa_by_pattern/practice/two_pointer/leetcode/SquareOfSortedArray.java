package dsa_by_pattern.practice.two_pointer.leetcode;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        //int[] nums = {-4, -1, 0, 3, 10};
        //int[] nums = {-1};
        int[] nums = {-1, 2, 2};
        SquareOfSortedArray square = new SquareOfSortedArray();
        System.out.println("Arrays.toString(square.sortedSquares(nums)) = " + Arrays.toString(square.sortedSquares(nums)));

    }

    public int[] sortedSquares(int[] nums) {
        if (nums.length > 1) {
            int m = 0;
            int first = 0;
            int second = 0;
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    m = m + 1;
                }
            }
            if (m == nums.length) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = nums[i] * nums[i];
                }
                int[] negative_reverse = new int[nums.length];
                int j = 0;
                for (int i = nums.length - 1; i >= 0; i--) {
                    negative_reverse[j] = nums[i];
                    j++;
                }
                return negative_reverse;
            } else {
                int[] negative = Arrays.copyOfRange(nums, 0, m);
                int[] positive = Arrays.copyOfRange(nums, m, nums.length);
                for (int i = 0; i < negative.length; i++) {
                    negative[i] = negative[i] * negative[i];
                }
                int[] negative_reverse = new int[negative.length];
                int j = 0;
                for (int i = negative.length - 1; i >= 0; i--) {
                    negative_reverse[j] = negative[i];
                    j++;
                }
                for (int i = 0; i < positive.length; i++) {
                    positive[i] = positive[i] * positive[i];
                }
                while (first < negative_reverse.length && second < positive.length) {
                    if (negative_reverse[first] < positive[second]) {
                        nums[k] = negative_reverse[first];
                        first++;
                    } else {
                        nums[k] = positive[second];
                        second++;
                    }
                    k++;
                }
                while (first < negative_reverse.length) {
                    nums[k] = negative_reverse[first];
                    first++;
                    k++;
                }
                while (second < positive.length) {
                    nums[k] = positive[second];
                    second++;
                    k++;
                }
                return nums;
            }
        } else {
            nums[0] = nums[0] * nums[0];
            return nums;
        }
    }
}
