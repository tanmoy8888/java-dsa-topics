package topics.binary_search.test;

public class SearchInSortedArray {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7};
        int[] arr = {1, 1, 2};
        for (int i = 1; i < arr.length - 2; i++) {
            if ((arr[i] != arr[i - 1]) && (arr[i] != arr[i + 1])) {
                System.out.println("arr[i] = " + arr[i]);
                break;
            }
        }
    }
}
