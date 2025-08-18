package topics.sorting;

import java.util.Arrays;

/**
   Sort an array in descending order using bubble sort.

 */

public class SortAnArrayInDescendingOrderUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        sortInDescendingOrderUsingBubbleSort(arr);
    }

    private static void sortInDescendingOrderUsingBubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Printing array = " + Arrays.toString(arr));
    }
}
