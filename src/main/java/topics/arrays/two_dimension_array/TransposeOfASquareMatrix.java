package topics.arrays.two_dimension_array;

// This is for only square matrix

public class TransposeOfASquareMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
         printArray(arr);
        System.out.println("Printing transpose matrix");
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
