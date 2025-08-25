package topics.binary_search.gfg;

public class FindTheFloorOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        System.out.println("findFloor(arr, x) = " + findFloor(arr, x));

    }

    public static int findFloor(int[] arr, int x) {
        int low = 1;
        int high = arr.length - 2;
        int index = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if ((arr[middle] == x) || (arr[middle] <= x && arr[middle - 1] <= x) || (arr[middle] <= x && arr[middle + 1] <= x)) {
                index = middle;
                break;
            } else if (arr[middle] > x) high = middle - 1;
            else {
                low = middle + 1;
            }
        }
        return index;
    }
}
