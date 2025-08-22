package topics.binary_search.leetcode;

import java.util.Arrays;

/**
  Leetcode : 34. Find First and Last Position of Element in Sorted Array

 Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

 If target is not found in the array, return [-1, -1].

 You must write an algorithm with O(log n) runtime complexity.


 

 */

public class FirstAndLastPositionOfASortedArray {
    public static void main(String[] args) {
       /* int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;*/
        int[] nums = {2, 2};
        int target = 2;
        System.out.println("searchRange(nums,target) = " + Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstIndex = -1;
        int[] arr = new int[2];
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) high = middle - 1;
            else if (nums[middle] < target) low = middle + 1;
            else {
                firstIndex = middle;
                high = middle - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        int lastIndex = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) high = middle - 1;
            else if (nums[middle] < target) low = middle + 1;
            else {
                lastIndex = middle;
                low = middle + 1;
            }
        }
        arr[0] = firstIndex;
        arr[1] = lastIndex;
        return arr;
    }
}
