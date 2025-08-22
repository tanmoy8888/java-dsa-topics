package topics.binary_search;

public class SearchInDescendingOrder {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 3, 2, 1};
        int target = 1;
        System.out.println("search(nums,target) = " + search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) low = middle + 1;
            else if (nums[middle] < target) high = middle - 1;
            else {
                index = middle;
                break;
            }
        }
        return index;
    }

}
