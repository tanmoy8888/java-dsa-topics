package topics.sorting.basic_sorting;

import java.util.Arrays;

/**
 *   This is bubble sort code
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Printing array = " + Arrays.toString(arr));
    }
}
