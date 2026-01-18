package dsa_by_pattern.practice.two_pointer.leetcode;

/**
 * Leetcode :  75. Sort Colors
 * <p>
 * https://leetcode.com/problems/sort-colors/description/
 */

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int middle = 0;
        int high = nums.length - 1;

    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
