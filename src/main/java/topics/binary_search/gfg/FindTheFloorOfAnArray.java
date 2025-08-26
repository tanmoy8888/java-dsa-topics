package topics.binary_search.gfg;

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
            System.out.println("low -----------" + low);
            System.out.println("high = " + high);
            int middle = (low + high) / 2;
            System.out.println("middle = " + middle);
            if (arr[middle] <= x) {
                index = middle;
                System.out.println("index = " + index);
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return index;
    }
}
