package dsa_by_pattern.practice.two_pointer.practice;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        System.out.println("result[] = " + Arrays.toString(result(arr)));
    }

    private static int[] result(int[] arr) {
        int start = 0;
        int second = 1;
        while (second <= arr.length - 1) {
            if (arr[second] == arr[second - 1]) {
                second++;
            } else {
                start = start+1;
                arr[start] = arr[second];
                second++;
            }
        }
        return arr;
    }
}
