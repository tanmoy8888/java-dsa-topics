package topics.arrays.two_pointers;

import java.util.Arrays;

public class Place0And1InAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                arr[end] = 1;
                arr[start] = 0;
            } else if (arr[start] == 0) {
                start++;
            } else if (arr[end] == 1) {
                end--;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
