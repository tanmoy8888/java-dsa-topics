package topics.arrays.leetcode;

/**
 * Leetcode : 867. Transpose Matrix
 * <p>
 * Given a 2D integer array matrix, return the transpose of matrix.
 * <p>
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * Example 2:
 * <p>
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 1000
 * 1 <= m * n <= 105
 * -109 <= matrix[i][j] <= 109
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Printing original array");
        printArray(matrix);
        System.out.println("Printing transposed array");
        printArray(transpose(matrix));
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
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
