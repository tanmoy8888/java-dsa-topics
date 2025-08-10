package topics.arrays.two_pointers;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int maxSum = Integer.MIN_VALUE;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("maxSum = " + maxSum);
        System.out.println("row = " + row);
    }
}
