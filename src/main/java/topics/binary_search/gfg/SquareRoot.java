package topics.binary_search.gfg;

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
                low = middle + 1
            } else {
                high = middle - 1;
            }
        }
        return sqrt;
    }
}
