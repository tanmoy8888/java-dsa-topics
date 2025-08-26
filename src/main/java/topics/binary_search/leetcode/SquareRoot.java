package topics.binary_search.leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("mySqrt(x) = " + mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x <= 0) return 1;
        else {
            int low = 0;
            int high = x;
            int sqrt = 1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (middle * middle <= x) {
                    sqrt = middle;
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
            return sqrt;
        }
    }
}
