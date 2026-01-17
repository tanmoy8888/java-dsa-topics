package dsa_by_pattern.practice.leetcode;

import java.util.Arrays;

/**
 * Leetcode 283. Move Zeroes
 * <p>
 * https://leetcode.com/problems/move-zeroes/description/
 */

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int order = 0;
        int non_zero = 0;
        while (order < nums.length) {
            if (nums[order] != 0) {
                nums[non_zero] = nums[order];
                non_zero++;
            }
            order++;
        }
        while (non_zero < nums.length) {
            nums[non_zero] = 0;
            non_zero++;
        }
    }
}
