package topics.binary_search.leetcode;

public class PeakIndexOfMountainArray {
    public static void main(String[] args) {
      //  int[] arr = {0, 2, 1, 0};
        int[] arr = {3,4,5,1};
        System.out.println("peakIndexInMountainArray(arr) = " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] > arr[middle + 1] && arr[middle] > arr[middle - 1]) {
                index = middle;
                break;
            } else if (arr[middle] > arr[middle - 1]) {
                high = middle - 1;
            } else if (arr[middle] < arr[middle + 1]) {
                low = middle + 1;
            }
        }
        return index;
    }
}
