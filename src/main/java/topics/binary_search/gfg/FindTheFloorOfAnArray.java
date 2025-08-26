package topics.binary_search.gfg;

/**

 GFG : Floor in a Sorted Array

 https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

 Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x.
 This element is called the floor of x. If such an element does not exist, return -1.

 Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.



 */

public class FindTheFloorOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        System.out.println("findFloor(arr, x) = " + findFloor(arr, x));
    }

    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] <= x) {
                index = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return index;
    }
}
