package topics.binary_search.gfg;

/**
 GFG : Square Root
 https://www.geeksforgeeks.org/problems/square-root/1

 Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

 Floor value of any number is the greatest Integer which is less than or equal to that number.

 Examples:

 Input: n = 4
 Output: 2
 Explanation: Since, 4 is a perfect square, so its square root is 2.
 Input: n = 11
 Output: 3
 Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
 Input: n = 1
 Output: 1
 Explanation: 1 is a perfect sqaure, so its square root is 1.
 Constraints:
 1 ≤ n ≤ 3*104



 */
public class SquareRoot {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("floorSqrt(n) = " + floorSqrt(n));
    }

    private static int floorSqrt(int n) {
        int low = 0;
        int high = n;
        int sqrt = 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (middle * middle <= n) {
                sqrt = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return sqrt;
    }
}
