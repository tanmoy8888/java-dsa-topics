package dsa_by_topics.practice;

import java.util.Arrays;

/**
 * Leetcode 88. Merge Sorted Array
 */

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        MergeTwoSortedArray merge = new MergeTwoSortedArray();
        merge.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = Arrays.copyOfRange(nums1, 0, m);
        while (i < m && j < n) {
            if (temp[i] < nums2[j]) {
                nums1[k] = temp[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            nums1[k] = temp[i];
            i++;
            k++;
        }
        while (j < n) {
            nums1[k] = temp[j];
            j++;
            k++;
        }
    }

}
