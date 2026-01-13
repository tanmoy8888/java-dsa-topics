package dsa_by_topics.practice;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int [] arr = {4,5,2,1,3};
        int target = 6;
    }
    private static int[] twoPointer(int[] arr , int target){
        int [] result = new int[2];
        int start = 0 ;
        int end = arr.length-1;
        Arrays.sort(arr);
        while (start>end){
            if((arr[start]+arr[end]) == target){
                result[0] = arr[start];
                result[1] = arr[end];
                return result;
            }
        }
    }
}
