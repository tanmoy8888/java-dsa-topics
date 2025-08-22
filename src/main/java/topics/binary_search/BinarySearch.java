package topics.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println("Output = " + search(nums, target));

    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] > target) high = middle - 1;
            else if (nums[middle] < target) low = middle + 1;
            else return middle;
        }
        return -1;
    }
}
