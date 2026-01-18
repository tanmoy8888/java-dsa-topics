package dsa_by_pattern._01_two_pointer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode :  15. 3Sum
 * <p>
 * Link  :  https://leetcode.com/problems/3sum/description/
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 * <p>
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 * <p>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */

public class SumOfTripletEqualsToZero {
    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums = {0,1,1};
        int[] nums = {0,0,0};
        System.out.println("threeSum(nums) = " + threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && (nums[i-1] == nums[i])) {
                continue;
            } else {
                int left = i + 1;
                int right = n - 1;
                int sum = -nums[i];
                while (left < right) {
                    int current = nums[left] + nums[right];
                    if (sum == current) {
                        List<Integer> found = new ArrayList<>();
                        found.add(nums[left]);
                        found.add(nums[right]);
                        found.add(nums[i]);
                        list.add(found);
                        left++;
                        right--;
                        while (left < n - 1 && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (right > i && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (current < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
