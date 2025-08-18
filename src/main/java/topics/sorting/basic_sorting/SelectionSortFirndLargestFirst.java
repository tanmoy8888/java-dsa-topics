package topics.sorting.basic_sorting;

import java.util.Arrays;

public class SelectionSortFirndLargestFirst {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        findLargetFirst(arr);
    }

    private static void findLargetFirst(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            // now swap
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Output = " + Arrays.toString(arr));
    }
}
