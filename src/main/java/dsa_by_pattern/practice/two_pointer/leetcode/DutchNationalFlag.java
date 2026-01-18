package dsa_by_pattern.practice.two_pointer.leetcode;

import java.util.Arrays;

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
        while (middle <= high) {
            if (nums[middle] == 0) {
                swap(nums, middle, low);
                low++;
                middle++;
            } else if (nums[middle] == 2) {
                swap(nums, middle, high);
                high--;
            } else {
                middle++;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
