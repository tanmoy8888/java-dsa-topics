package dsa_by_pattern._02_sliding_window.leetcode;

/**
 *  Leetcode 209. Minimum Size Subarray Sum
 *
 *  https://leetcode.com/problems/minimum-size-subarray-sum/description/
 *
 */

public class _02_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("minSubArrayLen(nums,target) = " + minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int minimum = Integer.MAX_VALUE;
        while (high < nums.length) {
            sum = nums[low] + nums[high];
            if (sum >= target) {
                if (minimum > sum) {
                    minimum = Math.min(sum, minimum);
                }
            } else if (sum < target) {
                high++;
            } else {
                low++;
            }
        }
        int length = high - low;
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
