package topics.basics.patterns.practice;

/*
 Print this below start pattern

 *        *
   *   *
     *
   *   *
 *        *


 */
public class CrossPattern_8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n + 1 - i) System.out.print("* ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
