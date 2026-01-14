package dsa_by_topics.practice.leetcode;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        SquareOfSortedArray square = new SquareOfSortedArray();
        System.out.println("Arrays.toString(square.sortedSquares(nums)) = " + Arrays.toString(square.sortedSquares(nums)));

    }

    public int[] sortedSquares(int[] nums) {
        int m = 0;
        int first = 0;
        int second = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                m = m + 1;
            }
        }
        int[] negative = Arrays.copyOfRange(nums, 0, m + 1);
        System.out.println("Arrays.toString(negative) = " + Arrays.toString(negative));
        int[] positive = Arrays.copyOfRange(nums, m + 1, nums.length);
        System.out.println("Arrays.toString(positive) = " + Arrays.toString(positive));
        for (int i = 0; i < negative.length; i++) {
            negative[i] = negative[i] * negative[i];
        }
        System.out.println("Arrays.toString(negative) after square = " + Arrays.toString(negative));
        int[] negative_reverse = new int[negative.length];
        int j = 0;
        for (int i = negative.length - 1; i >= 0; i--) {
            System.out.println("negative[i] = " + i + " : " + negative[i]);
            negative_reverse[j] = negative[i];
            j++;
        }
        System.out.println("Arrays.toString(negative_reverse) = " + Arrays.toString(negative_reverse));
        for (int i = 0; i < positive.length; i++) {
            positive[i] = positive[i] * positive[i];
        }
        System.out.println("Arrays.toString(positive) = " + Arrays.toString(positive));
        System.out.println("negative_reverse.length = " + negative_reverse.length);
        System.out.println("positive.length = " + positive.length);
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
}
