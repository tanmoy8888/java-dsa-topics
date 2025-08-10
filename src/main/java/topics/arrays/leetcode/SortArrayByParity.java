package topics.arrays.leetcode;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println("Output = " + Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        int temp = 0;
        int even = -1;
        int odd = -1;
        while (start < end) {
            if (true) {
                temp = nums[start - 1];
                nums[start - 1] = nums[start];
                nums[start] = temp;
                start += 2;
            } else if (nums[end] % 2 == 1 && nums[end - 1] % 2 == 0) {
                temp = nums[end];
                nums[end] = nums[end - 1];
                nums[end - 1] = temp;
                end -= 2;
            }
        }
        return nums;

    }
}
