package topics.arrays;

/**
 * Find maximum element of a given array
 */

public class MaxElementOfAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("max = " + max);
    }
}
