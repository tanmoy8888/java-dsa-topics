package topics.arrays.leetcode;

public class NonDecreasingArray {
    public static void main(String[] args) {
        //int[] nums = {4, 2, 3};
        //int[] nums = {4, 2, 1};
        int[] nums = {3, 4, 2, 3};
        System.out.println("checkPossibility(nums) = " + checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 2; i < nums.length - 1; i++) {
            if (nums[1] > nums[0]) max = nums[1];
            else {
                max = nums[0];
                count++;
            }
            if (nums[i] < nums[i + 1]) {
                max = nums[i + 1];
            }
            if (max > nums[i + 1]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
