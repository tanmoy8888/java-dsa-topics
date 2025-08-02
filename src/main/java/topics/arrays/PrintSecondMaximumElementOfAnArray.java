package topics.arrays;

public class PrintSecondMaximumElementOfAnArray {
    public static void main(String[] args) {
        //int [] arr = {6,1,3,8,6,8,4};
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("getSecondLargest(arr) = " + getSecondLargest(arr));

    }

   /* public static int getSecondLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max) secondMax = arr[i];
        }
        return secondMax;
    }*/

    // Another approach using single loop

    public static int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }
}
