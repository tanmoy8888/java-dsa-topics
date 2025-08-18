package topics.sorting.basic_sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = i ; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swap now with minimum value
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Output = " + Arrays.toString(arr));
    }
}
