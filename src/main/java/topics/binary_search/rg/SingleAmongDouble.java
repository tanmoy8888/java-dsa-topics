package topics.binary_search.rg;

public class SingleAmongDouble {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        System.out.println("singleAmongDouble(arr) = " + singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 2;
        int element = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if ((nums[middle] != nums[middle - 1]) && (nums[middle] != nums[middle + 1])) {
                element = nums[middle];
                break;
            } else if ((middle + 1) % 2 == 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return element;
    }
}
