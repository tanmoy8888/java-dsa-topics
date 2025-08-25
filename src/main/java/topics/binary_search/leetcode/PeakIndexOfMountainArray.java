package topics.binary_search.leetcode;

/**
 leetcode : 852. Peak Index in a Mountain Array

 You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

 Return the index of the peak element.

 Your task is to solve it in O(log(n)) time complexity.

 Example 1:

 Input: arr = [0,1,0]

 Output: 1

 Example 2:

 Input: arr = [0,2,1,0]

 Output: 1

 Example 3:

 Input: arr = [0,10,5,2]

 Output: 1



 Constraints:

 3 <= arr.length <= 105
 0 <= arr[i] <= 106
 arr is guaranteed to be a mountain array.

 */

public class PeakIndexOfMountainArray {
    public static void main(String[] args) {
        //  int[] arr = {0, 2, 1, 0};
        int[] arr = {3, 4, 5, 1};
        System.out.println("peakIndexInMountainArray(arr) = " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length - 2;
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if ((arr[middle] > arr[middle + 1]) && (arr[middle] > arr[middle - 1])) {
                index = middle;
                break;
            } else if (arr[middle] > arr[middle - 1]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return index;
    }
}
