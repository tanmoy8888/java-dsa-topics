package topics.binary_search.leetcode;

public class MaximumCountOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        //int[] nums = {-2, -1, -1, 1, 2, 3};
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
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
                if (nums[middle] == 0) {
                    high = middle - 1;
                } else if (nums[middle] <= -1) {
                    maxNegativeIndex = middle;
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
            // Now find min positive index
            low = maxNegativeIndex + 1;
            high = nums.length - 1;
            int minPositiveIndex = -1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (nums[middle] == 0) {
                    low = middle + 1;
                } else if (nums[middle] > 0) {
                    minPositiveIndex = middle;
                    high = middle - 1;
                }
            }
            maximumCount = Math.max((maxNegativeIndex + 1), (nums.length - minPositiveIndex));
        }
        return maximumCount;
    }
}
