package topics.binary_search;

/**
  Leetcode : 704. Binary Search
 Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 You must write an algorithm with O(log n) runtime complexity.

 



 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println("Output = " + search(nums, target));

    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) high = middle - 1;
            else if (nums[middle] < target) low = middle + 1;
            else return middle;
        }
        return -1;
    }
}
