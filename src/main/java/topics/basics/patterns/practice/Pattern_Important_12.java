package topics.basics.patterns.practice;

/**
 Print this below pattern

 *
 * *
 * * *
 * * * *

 */

public class Pattern_Important_12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) System.out.print("* ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
