package dsa_by_pattern.practice.leetcode;

import java.util.Arrays;

/**
 * Leetcode 16. 3Sum Closest
 * <p>
 * Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
 * <p>
 * Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 * <p>
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 500
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 */

public class ThreeSumClosest {
    public static void main(String[] args) {
      /*  int[] nums = {-1, 2, 1, -4};
        int target = 1;*/
        int[] nums = {0, 0, 0};
        int target = 1;
        System.out.println("threeSumClosest(nums,target) = " + threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int lowest_sum = 0;
        int max_diff = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            } else {
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    sum = nums[i] + nums[left] + nums[right];
                    diff = Math.abs(target - sum);
                    System.out.println("sum = " + sum);
                    System.out.println("diff = " + diff);
                    if (diff < max_diff) {
                        max_diff = diff;
                        lowest_sum = sum;
                        System.out.println("max_diff = " + max_diff);
                        System.out.println("lowest_sum = " + lowest_sum);
                    }
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        return sum;
                    }
                }
            }
        }
        return lowest_sum;
    }
}
