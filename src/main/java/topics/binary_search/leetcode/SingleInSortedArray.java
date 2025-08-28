package topics.binary_search.leetcode;

/**
 Leetcode : 540. Single Element in a Sorted Array

 You are given a sorted array consisting of only integers where every element appears exactly twice,
 except for one element which appears exactly once.
 Return the single element that appears only once.

 Your solution must run in O(log n) time and O(1) space.



 */

public class SingleInSortedArray {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        //int[] nums = {3, 3, 7, 7, 10, 11, 11};
        int[] nums = {1, 1, 2};
        System.out.println("singleNonDuplicate(nums) = " + singleNonDuplicate(nums));

    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        else {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if ((nums[middle - 1] != nums[middle]) && (nums[middle] != nums[middle + 1])) return nums[middle];
                else {
                    int first = middle;
                    int second = middle;
                    if (nums[middle - 1] == nums[middle]) first = middle - 1;
                    else second = middle + 1;
                    int leftCount = first - low;
                    if (leftCount % 2 == 0) low = second + 1;
                    else high = first - 1;
                }
            }
        }
        return -1;
    }
}
