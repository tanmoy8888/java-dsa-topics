package topics.basics.patterns.practice;

/**
 Print this below pattern,

 * * * * * * * * *
 *               *
 *               *
 *               *
 *               *
 *               *
 *               *
 *               *
 * * * * * * * * * 


 */

public class HallowRectangle_6 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("* ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
