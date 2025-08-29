package topics.binary_search.leetcode;

public class FindElementInARotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("search(nums) = " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            System.out.println("middle = " + middle);
            if (nums[middle] == target) return middle;
            else if (nums[low] <= nums[middle]) {
                if((nums[low] <= target) && (nums[middle] >= target)){
                    high = middle-1;
                }
                low = middle+1;
            } else if(nums[middle] > nums[high]){
                if((nums[high] >= target) && (nums[middle] >= target)){
                    low = middle-1;
                }
                low = middle-1;
            }
        }
        return -1;
    }
}
