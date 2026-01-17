package dsa_by_pattern.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * THIS IS NOT TWO POINTER APPROACH - This is using extra space , complexity O(N)
 */

public class TwoPointerReturnIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 1, 3};
        int target = 6;
        System.out.println("twoPointer(arr,target) = " + Arrays.toString(findIndex(arr, target)));
    }

    private static int[] findIndex(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]) && (map.get(target - arr[i]) != i)) {
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                break;
            }
        }
        return result;
    }
}
