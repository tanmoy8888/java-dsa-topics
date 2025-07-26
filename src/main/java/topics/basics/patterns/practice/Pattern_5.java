package topics.basics.patterns.practice;

import java.util.Scanner;

/**
 * Print this below pattern.

 O/P =>

 * * * * *
 * * * *
 * * *
 * *
 *

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
    }
}
