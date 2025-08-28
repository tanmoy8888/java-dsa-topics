package topics.binary_search.rg;

public class SingleAmongDouble {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        // int[] nums = {3, 3, 7, 7, 10, 11, 11};
        //int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8};
        int[] nums = {1, 1, 2};
        System.out.println("singleAmongDouble(arr) = " + singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        else {
            int low = 0;
            int high = nums.length - 1;
            int element = -1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (middle % 2 == 1) {
                    middle--;
                }
                else if (nums[middle] == nums[middle + 1]) {
                    low = middle + 2;
                } else {
                    high = middle;
                }
            }
            return element;
        }
    }
}
