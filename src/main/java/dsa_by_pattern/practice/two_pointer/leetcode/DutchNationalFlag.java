package dsa_by_pattern.practice.two_pointer.leetcode;

import java.util.Arrays;

/**
 * Leetcode :  75. Sort Colors
 * <p>
 * https://leetcode.com/problems/sort-colors/description/
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is either 0, 1, or 2.
 *
 *
 * Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 *
 *
 *
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
