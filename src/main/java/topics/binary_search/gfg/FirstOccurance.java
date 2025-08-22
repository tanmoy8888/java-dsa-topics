package topics.binary_search.gfg;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2};
        int k = 1;
        System.out.println("binarysearch(arr,k) = " + binarysearch(arr, k));
    }

    public static int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] > k) high = middle - 1;
            else if (arr[middle] < k) low = middle + 1;
            else {
                index = middle;
                high = middle - 1;
            }
        }
        return index;
    }
}
