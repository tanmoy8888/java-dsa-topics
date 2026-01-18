package dsa_by_pattern._01_two_pointer.practice;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 1, 3};
        int target = 6;
        System.out.println("twoPointer(arr,target) = " + Arrays.toString(twoPointer(arr, target)));
    }

    private static int[] twoPointer(int[] arr, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = arr.length - 1;
        Arrays.sort(arr);
        while (start < end) {
            if ((arr[start] + arr[end]) == target) {
                result[0] = arr[start];
                result[1] = arr[end];
                break;
            } else if ((arr[start] + arr[end]) > target) {
                end--;
            } else if ((arr[start] + arr[end]) < target) {
                start++;
            }
        }
        return result;
    }
}
