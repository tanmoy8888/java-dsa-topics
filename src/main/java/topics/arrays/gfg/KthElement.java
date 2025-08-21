package topics.arrays.gfg;

import java.util.Arrays;

/**
 * GFG : Kth Smallest
 * https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
 */
public class KthElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("kthSmallest element is  = " + kthSmallest(arr, k));

    }

    public static int kthSmallest(int[] arr, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            int min = arr[i];
            int minIndex = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        return arr[k - 1];
    }
}
