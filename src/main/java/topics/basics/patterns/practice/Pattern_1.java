package topics.basics.patterns.practice;

import java.util.Scanner;

/**
 * Print this below pattern.

 O/P =>

 *
 * *
 * * *
 * * * *
 * * * * *

 */

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
