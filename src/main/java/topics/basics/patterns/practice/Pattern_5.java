package topics.basics.patterns.practice;

import java.util.Scanner;

/**
 * Print this below pattern.
 * <p>
 * O/P =>
 * <p>
 * * * * *
 * * * *
 * * *
 * *
 */

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // First approach

       /* for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

        // Second approach
        /*
          // very important
          i+j = n+1
          j = n+1-i
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
