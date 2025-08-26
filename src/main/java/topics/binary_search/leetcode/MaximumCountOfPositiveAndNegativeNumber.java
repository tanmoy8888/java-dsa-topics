package topics.binary_search.leetcode;

public class MaximumCountOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println("maximumCount(nums) = " + maximumCount(nums));
    }

    public static int maximumCount(int[] nums) {
        int maximumCount = 0;
        if (nums[0] < 0 && nums[nums.length - 1] < 0) maximumCount = nums.length - 1;
        else if (nums[0] > 0 && nums[nums.length - 1] > 0) maximumCount = nums.length - 1;
        else {
            int low = 0;
            int high = nums.length - 1;
            int maxNegativeIndex = -1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (nums[middle] <= 0) {
                    maxNegativeIndex = middle;
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
            maximumCount = Math.max((maxNegativeIndex + 1), (nums.length - (maxNegativeIndex + 1)));
        }
        return maximumCount;
    }
}
