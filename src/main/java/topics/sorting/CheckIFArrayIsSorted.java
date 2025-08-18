package topics.sorting;

/**
 *  GFG : https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
 *  Check if array is sorted
 */
public class CheckIFArrayIsSorted {
    public static void main(String[] args) {
     //int [] arr = {10, 20, 30, 40, 50};
     int [] arr = {90, 80, 100, 70, 40, 30};
        System.out.println("isSorted(arr) = " + isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
